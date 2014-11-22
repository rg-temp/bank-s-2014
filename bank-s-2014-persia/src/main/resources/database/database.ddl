DROP TABLE IF EXISTS public.account;
CREATE TABLE public.account
(acc_id INTEGER NOT NULL,
iban CHAR(2) NOT NULL,
bic CHAR(3) NOT NULL,
PRIMARY KEY (id));

INSERT INTO account (acc_id, iban, bic) VALUES 
(1,'i1','aaa'),
(2,'i2','bbb'),
(3,'i3','ccc');
