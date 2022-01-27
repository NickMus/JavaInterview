SELECT * FROM Cinema.Films left join  Cinema.Time_table on Time_table.idFilms = Films.idFilms;

//тут я пытлся вывести 3 колонки (имя,длительность и сеанс).