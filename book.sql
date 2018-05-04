use test;
drop table if exists book;
create table book
(
  id           int not null auto_increment
  primary key,
  title        varchar(100)        not null,
  description  varchar(255)        null,
  author       varchar(100)        not null,
  isbn         varchar(20)         null,
  print_year   int(4)  default '0' null,
  read_already tinyint default '0' null
);

insert into book (id, title, description, author, isbn, print_year, read_already) values (1, 'justo etiam', 'at dolor quis odio consequat varius integer ac leo', 'Nichols Haws', '574470140-0', 2013, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (2, 'justo aliquam quis turpis', 'pede morbi porttitor lorem id', 'Bernette Attwater', '692559117-9', 2007, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (3, 'dictumst etiam faucibus cursus urna', 'convallis nunc proin at turpis a pede posuere nonummy integer', 'Dmitri Gors', '073593676-5', 2012, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (4, 'nisl nunc rhoncus dui vel', 'rutrum nulla nunc purus phasellus', 'Fey Harker', '413773360-0', 1991, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (5, 'non velit donec diam', 'phasellus in felis donec semper', 'Lonnie Coultar', '717600662-8', 2012, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (6, 'praesent blandit lacinia erat vestibulum', 'volutpat sapien arcu sed augue', 'May Benjafield', '599500045-4', 2013, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (7, 'dapibus augue', 'ultrices vel augue vestibulum ante ipsum primis', 'Carilyn Goodbody', '434203475-1', 1993, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (8, 'ante nulla', 'rutrum ac lobortis vel dapibus at diam nam', 'Dusty Jeannet', '011865268-0', 2012, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (9, 'mauris enim', 'felis eu sapien cursus vestibulum proin eu mi nulla', 'Dillie Russel', '670019581-0', 1985, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (10, 'nisl nunc nisl', 'sit amet nulla quisque arcu libero rutrum ac', 'Alberta Greystock', '082654306-5', 1995, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (11, 'tellus nulla', 'nunc rhoncus dui vel sem sed sagittis', 'Gloriana Larive', '619118734-3', 2007, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (12, 'integer non velit donec', 'vestibulum ante ipsum primis in faucibus orci luctus et', 'Allard Eburne', '961232714-9', 2005, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (13, 'est donec odio', 'vivamus vestibulum sagittis sapien cum sociis natoque penatibus et magnis', 'Karole Kohlert', '817440501-1', 2011, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (14, 'nullam varius nulla', 'amet justo morbi ut odio cras mi', 'Darcee Kurten', '205954807-1', 1992, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (15, 'mauris non', 'amet cursus id turpis integer aliquet massa', 'Isidor Rudgerd', '299239277-4', 2001, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (16, 'sed tincidunt eu felis', 'erat fermentum justo nec condimentum neque sapien placerat ante nulla', 'Odilia Bucktharp', '152297481-4', 1990, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (17, 'enim in tempor', 'varius nulla facilisi cras non velit nec nisi vulputate nonummy', 'Roy Adnams', '297701401-2', 2009, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (18, 'praesent blandit nam nulla', 'non mattis pulvinar nulla pede', 'Ryley Aggott', '896901394-6', 2009, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (19, 'pretium quis', 'libero nullam sit amet turpis elementum ligula', 'Filmer Burle', '407223638-1', 2012, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (20, 'metus arcu', 'at nulla suspendisse potenti cras in purus eu magna', 'Irwin Eardley', '333109639-3', 1991, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (21, 'sit amet', 'morbi vel lectus in quam fringilla rhoncus mauris enim', 'Melisande Postans', '212158250-9', 2006, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (22, 'nonummy maecenas tincidunt', 'in hac habitasse platea dictumst', 'Odo Pryor', '612057733-5', 2006, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (23, 'et ultrices', 'maecenas rhoncus aliquam lacus morbi quis tortor id nulla', 'Dita Siddon', '380726320-9', 1989, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (24, 'ut volutpat', 'vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum', 'Emmalee Itzkovsky', '488671646-6', 2012, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (25, 'et magnis dis parturient', 'justo aliquam quis turpis eget', 'Cirstoforo Huntly', '614900475-9', 1994, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (26, 'nisi volutpat eleifend', 'sodales sed tincidunt eu felis fusce posuere', 'Chaunce Browne', '789919246-3', 2006, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (27, 'libero ut', 'id sapien in sapien iaculis congue', 'Eve Teal', '390701623-8', 2007, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (28, 'nec molestie', 'nisl nunc nisl duis bibendum felis', 'Nealy Giuroni', '914167572-X', 2011, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (29, 'ultrices erat tortor sollicitudin', 'sociis natoque penatibus et magnis dis parturient montes', 'Shirline Bowles', '149228159-X', 1992, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (30, 'dictumst etiam faucibus', 'a nibh in quis justo maecenas rhoncus aliquam', 'Gaston Bruyett', '820111025-0', 2008, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (31, 'vulputate vitae nisl', 'purus aliquet at feugiat non pretium quis', 'Mohammed Swayne', '399194633-5', 2010, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (32, 'amet turpis', 'pretium nisl ut volutpat sapien arcu sed augue aliquam erat', 'Kaitlynn Leaves', '098370524-0', 1996, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (33, 'porta volutpat quam', 'sit amet justo morbi ut odio cras mi pede malesuada', 'Kordula Flett', '870326242-1', 1991, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (34, 'tincidunt eu felis fusce', 'integer a nibh in quis justo maecenas rhoncus aliquam lacus', 'Gerhardt Laroze', '626471054-7', 2011, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (35, 'id ornare', 'tincidunt eu felis fusce posuere felis sed', 'Kelci Lowell', '446254511-7', 1993, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (36, 'posuere nonummy integer', 'ut mauris eget massa tempor convallis nulla neque libero', 'Karil Gudger', '824573774-7', 2004, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (37, 'nulla suscipit ligula in', 'maecenas tristique est et tempus', 'Emmy Geldart', '320934152-4', 1989, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (38, 'nam tristique', 'nulla justo aliquam quis turpis', 'Jefferey Silversmidt', '414018870-7', 1993, true);
insert into book (id, title, description, author, isbn, print_year, read_already) values (39, 'elementum in hac habitasse platea', 'mi in porttitor pede justo eu massa donec dapibus', 'Lemmie Bonelle', '465608355-0', 2005, false);
insert into book (id, title, description, author, isbn, print_year, read_already) values (40, 'morbi non lectus aliquam sit', 'est risus auctor sed tristique in tempus sit amet sem', 'Sawyere Boribal', '975435622-X', 1993, false);
