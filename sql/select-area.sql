SELECT id_restaurant,`name`FROM `stardapio`.`restaurant` WHERE ACOS( COS( RADIANS(lat) ) * COS( RADIANS( -23.570664 ) ) * COS( (RADIANS( lng )) - (RADIANS( -46.645117 ) ) ) + SIN( RADIANS( lat ) ) * SIN( RADIANS( -23.570664 ) ) ) * 6380 < 10;
