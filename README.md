# SI_lab2_215019

Кујтим Салиу, бр. на индекс 215019

2.Слика од CFG
![2diagram](https://github.com/kujtimsaliu/SI_lab2_215019/assets/36280465/db5c8f76-3dfb-4c16-8ffc-f3591dc5a1c7)


3.
За ова може да ги броиме бројот на ребра - бројот на јазли + 2
бројот на ребра -> 37
бројот на јазли -> 28
37-28 + 2 = 11

4.

user да е null - ке влезе во првиот if 

User user = new User(null, "215019", "KujtimSaliu");
овој test case ке влезе во другиот if ((user.getUsername() == null))  и потоа ке продолжи во делот каде проверува дали еамилот содржи "@" и ".", според дадениот аргумент емаилот не содржи ниту една од овие и ке продожи во делот каде што ке провери  "if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length() < 8)"
ова е false и ке оди во елсе делот каде што делот без празни карактери ке биде true и во for циклус ке провери дали лозинката има специјални карактери

User user = new User ("Kujtim", "K22 33", "kujtim.saliu@students.finki.ukim.mk"); 
User user1 = new User ("Saliu", "215019", "kujtim.saliu@students.finki.ukim.mk"); 
User user2 = new User ("Saliu", "11112222", "kujtim.saliu@students.finki.ukim.mk"); 
User user3 = new User ("kujitms222", "11223344", "kujtimsaliu001@gmail.com"); 
кај овој тест случај се провери дали емаилот содржи @ или . па после тоа ке провери дали лозинката содржи празен карактер

User user = new User ("kutjim", "kujtim", "KujtimSaliu"); во овој тест случај се проверува дали некој дел од username ја содржи лозинката

User user = new User (null, "kujtim", "kujtim.saliu@students.finki.ukim.mk"); 
проверува дали username е null.

5.
user == null	user да е null и ќе фрли exception
user.getPassword() == null	ќе фрли exception
user.getEmail() == null		ќе фрли exception
user!=null && user.getPassword()!=null && user.getEmail()!=null, па не влегуваме во if условот.
