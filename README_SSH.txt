hariton@NAMHARITO503430:~$ ssh hariton@192.168.178.65
hariton@192.168.178.65's password:
Last login: Fri Oct  7 15:18:16 2022 from 192.168.178.45
hariton@hserver:~$ mongosh
test> use development
switched to db development
development> db.article.find()
[
{
_id: ObjectId("634054e5e38a882ec0343c63"),
name: 'Titolo della pagina 31197',
category: 'COMPUTER_SCIENCE',
value: 'Contenuto della pagina 31197',
_class: 'net.hagik.springmongodemo.model.Article'
},
{
_id: ObjectId("6340550fe38a882ec0343c65"),
name: 'Titolo della pagina 3',
category: 'COMPUTER_SCIENCE',
value: 'Contenuto della pagina 3',
_class: 'net.hagik.springmongodemo.model.Article'
},
{
_id: ObjectId("63405514e38a882ec0343c66"),
name: 'Titolo della pagina 1',
category: 'COMPUTER_SCIENCE',
value: 'Contenuto della pagina 1',
_class: 'net.hagik.springmongodemo.model.Article'
}
]
development>
