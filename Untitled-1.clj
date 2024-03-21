C:\xampp\mysql\bin>mysql -u root -p
Enter password:
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 128
Server version: 10.4.32-MariaDB mariadb.org binary distribution

Copyright (c) 2000, 2018, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> use dbtokoti05
Database changed
MariaDB [dbtokoti05]> SELECT * FROM produk;
+----+--------+-------------------+------------+------------+------+----------+------------------------+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+-----------------+
| id | kode   | nama              | harga_beli | harga_jual | stok | min_stok | foto                   | deskripsi                                                                                                                                                                                                           | jenis_produk_id |
+----+--------+-------------------+------------+------------+------+----------+------------------------+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+-----------------+
|  1 | TV01   | Televisi 21 inchs |    3500000 |   50500000 |    5 |        2 |                        | NULL                                                                                                                                                                                                                |               1 |
|  2 | TV02   | Televisi 40 inch  |    5500000 |    7440000 |    4 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
|  3 | K001   | Kulkas 2 pintu    |    3500000 |    4680000 |    6 |        2 |                        | NULL                                                                                                                                                                                                                |               1 |
|  4 | M001   | Meja Makan        |     500000 |     600000 |    4 |        3 | NULL                   | NULL                                                                                                                                                                                                                |               2 |
|  5 | TK01   | Teh Kotak         |       3000 |       3500 |    6 |       10 | foto-5.png             | NULL                                                                                                                                                                                                                |               4 |
|  6 | PC01   | PC Desktop HP     |    7000000 |    9984000 |    9 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               5 |
|  7 | TB01   | Teh Botol         |       2000 |       2500 |   53 |       10 | foto-7.jpg             | NULL                                                                                                                                                                                                                |               4 |
|  8 | AC01   | Notebook Acer S   |    8000000 |   11232000 |    7 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               5 |
|  9 | LN01   | Notebook Lenovo   |    9000000 |   12480000 |    9 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               5 |
| 11 | L005   | Laptop Lenovo     |   13000000 |   16000000 |    5 |        2 |                        | NULL                                                                                                                                                                                                                |               1 |
| 15 | L112   | Kopi              |      20000 |      30000 |   10 |       15 | foto-15.png            | Luwak White Coffee merupakan bubuk biji kopi luwak yang dikombinasikan dengan gurihnya krimer serta manisnya gula. Keharuman kopi serta rasa manisnya yang pas juga membuat popularitas Luwak White Coffee melejit. |               4 |
| 16 | L113   | Teh Sosro 2       |      10000 |      15000 |   10 |       12 | .png                   | NULL                                                                                                                                                                                                                |               1 |
| 18 | L0015  | Laptop Asus       |    3000000 |    5000000 |   10 |       20 | foto-65542ffa66604.jpg | NULL                                                                                                                                                                                                                |               1 |
| 19 | TV0115 | Televisi 22 inc`  |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 20 | TV0116 | Televisi 23 inc   |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 21 | TV0117 | Televisi 24 inc   |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 22 | TV0118 | Televisi 25 inc   |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 24 | TV0120 | Televisi 27 inc   |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 25 | TV0121 | Televisi 28 inc   |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 26 | TV0122 | Televisi 29 inc   |    3500000 |   50500000 |    5 |        2 | NULL                   | NULL                                                                                                                                                                                                                |               1 |
| 27 | THP001 | Teh Pucuk         |       4000 |       5000 |   10 |        2 | pucuk.jpg              | Teh pucuk adalah                                                                                                                                                                                                    |               4 |
| 28 | THP002 | Teh Pucuk2        |       4000 |       5000 |   10 |        2 | pucuk.jpg              | Teh pucuk adalah                                                                                                                                                                                                    |               4 |
+----+--------+-------------------+------------+------------+------+----------+------------------------+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+-----------------+
22 rows in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT kode, nama, harga_beli, harga_jual FROM produk;
+--------+-------------------+------------+------------+
| kode   | nama              | harga_beli | harga_jual |
+--------+-------------------+------------+------------+
| TV01   | Televisi 21 inchs |    3500000 |   50500000 |
| TV02   | Televisi 40 inch  |    5500000 |    7440000 |
| K001   | Kulkas 2 pintu    |    3500000 |    4680000 |
| M001   | Meja Makan        |     500000 |     600000 |
| TK01   | Teh Kotak         |       3000 |       3500 |
| PC01   | PC Desktop HP     |    7000000 |    9984000 |
| TB01   | Teh Botol         |       2000 |       2500 |
| AC01   | Notebook Acer S   |    8000000 |   11232000 |
| LN01   | Notebook Lenovo   |    9000000 |   12480000 |
| L005   | Laptop Lenovo     |   13000000 |   16000000 |
| L112   | Kopi              |      20000 |      30000 |
| L113   | Teh Sosro 2       |      10000 |      15000 |
| L0015  | Laptop Asus       |    3000000 |    5000000 |
| TV0115 | Televisi 22 inc`  |    3500000 |   50500000 |
| TV0116 | Televisi 23 inc   |    3500000 |   50500000 |
| TV0117 | Televisi 24 inc   |    3500000 |   50500000 |
| TV0118 | Televisi 25 inc   |    3500000 |   50500000 |
| TV0120 | Televisi 27 inc   |    3500000 |   50500000 |
| TV0121 | Televisi 28 inc   |    3500000 |   50500000 |
| TV0122 | Televisi 29 inc   |    3500000 |   50500000 |
| THP001 | Teh Pucuk         |       4000 |       5000 |
| THP002 | Teh Pucuk2        |       4000 |       5000 |
+--------+-------------------+------------+------------+
22 rows in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT nama, harga_jual FROM produk
    -> WHERE harga_jual < 5000000 AND harga_jual > 5000000;
Empty set (0.002 sec)
MariaDB [dbtokoti05]> SELECT nama, harga_jual FROM produk
    -> WHERE harga_jual < 5000000 AND harga_jual >500000;
+----------------+------------+
| nama           | harga_jual |
+----------------+------------+
| Kulkas 2 pintu |    4680000 |
| Meja Makan     |     600000 |
+----------------+------------+
2 rows in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT id, nama FROM pelanggan WHERE id
    -> IN(2,4,6);
+----+---------------+
| id | nama          |
+----+---------------+
|  6 | Gayatri Dwi   |
|  2 | Pandan Wangi  |
|  4 | Swandaru Geni |
+----+---------------+
3 rows in set (0.002 sec)
MariaDB [dbtokoti05]> SELECT kode, nama, tgl_lahir FROM pelanggan
    -> ORDER BY tgl_lahir DESC;
+-------+--------------------+------------+
| kode  | nama               | tgl_lahir  |
+-------+--------------------+------------+
| K0011 | Ira                | 2023-11-07 |
| K0010 | Andi Wijaya        | 2023-11-07 |
| C001  | Agung Sedayu Group | 2010-01-01 |
| C009  | Ahmad Hasan        | 1992-10-15 |
| C010  | Cassanndra         | 1990-11-20 |
| C008  | Andre Haru         | 1990-07-15 |
| C007  | Dewi Gyat          | 1988-12-01 |
| C006  | Gayatri Dwi        | 1987-11-28 |
| C005  | Pradabashu         | 1985-04-02 |
| C003  | Sekar Mirah        | 1983-02-20 |
| C004  | Swandaru Geni      | 1981-01-04 |
| C002  | Pandan Wangi       | 1950-01-01 |
+-------+--------------------+------------+
12 rows in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT nama, harga_jual FROM produk
    -> ORDER BY harga_jual DESC LIMIT 4;
+-------------------+------------+
| nama              | harga_jual |
+-------------------+------------+
| Televisi 21 inchs |   50500000 |
| Televisi 24 inc   |   50500000 |
| Televisi 23 inc   |   50500000 |
| Televisi 22 inc`  |   50500000 |
+-------------------+------------+
4 rows in set (0.001 sec)
MariaDB [dbtokoti05]> SELECT nama, harga_jual FROM produk
    -> WHERE harga_jual LIMIT 4;
+-------------------+------------+
| nama              | harga_jual |
+-------------------+------------+
| Televisi 21 inchs |   50500000 |
| Televisi 40 inch  |    7440000 |
| Kulkas 2 pintu    |    4680000 |
| Meja Makan        |     600000 |
+-------------------+------------+
4 rows in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT MAX(harga_jual)
    -> AS produk_termahal FROM produk;
+-----------------+
| produk_termahal |
+-----------------+
|        50500000 |
+-----------------+
1 row in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT nama, tgl_lahir FROM pelanggan
    -> WHERE tmp_lahir = "jakarta";
+-------------+------------+
| nama        | tgl_lahir  |
+-------------+------------+
| Gayatri Dwi | 1987-11-28 |
| Dewi Gyat   | 1988-12-01 |
| Ira         | 2023-11-07 |
+-------------+------------+
3 rows in set (0.001 sec)

MariaDB [dbtokoti05]> SELECT kode, nama, harga_jual, stok FROM produk
    -> WHERE harga_jual > 10000000 AND stok > 5;
+------+-----------------+------------+------+
| kode | nama            | harga_jual | stok |
+------+-----------------+------------+------+
| AC01 | Notebook Acer S |   11232000 |    7 |
| LN01 | Notebook Lenovo |   12480000 |    9 |
+------+-----------------+------------+------+
2 rows in set (0.001 sec)