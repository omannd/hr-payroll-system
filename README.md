# HR Payroll System (Java OOP)

Bu proje, bir şirketin İnsan Kaynakları (HR) ve maaş hesaplama süreçlerini Nesne Yönelimli Programlama (OOP) prensipleriyle modelleyen, ölçeklenebilir bir konsol uygulamasıdır. Proje, kurumsal iş mantığının (Business Logic) kod mimarisine nasıl entegre edileceğini göstermek amacıyla geliştirilmiştir.

## Mimari ve İş Mantığı (Business Logic)

* **Abstraction (Soyutlama):** `Employee` adında soyut bir ana sınıf oluşturulmuş ve sisteme eklenecek her yeni çalışan tipinin `calculatePay();` metodunu kendi kurallarına göre hesaplaması zorunlu kılınmıştır.
* **Inheritance (Kalıtım):** Tam zamanlı (`FullTimeEmployee`) ve yarı zamanlı (`PartTimeEmployee`) çalışanlar `Employee` ana sınıfından miras alır. İsim ve temel maaş/saatlik ücret gibi ortak veriler `super()` metodu ile üst sınıfa aktarılarak kod tekrarı (WET) önlenmiştir.
* **Polymorphism (Çok Biçimlilik):** Ana `Main` sınıfında farklı sözleşme tiplerine sahip çalışanlar tek bir `ArrayList<Employee>` listesinde tutulmuş ve tek bir döngü ile maaş bordroları hatasız bir şekilde ekrana basılmıştır. Tam zamanlı çalışanda *(Temel Maaş + Prim)*, yarı zamanlı çalışanda *(Saatlik Ücret * Çalışılan Saat)* formülü dinamik olarak çalıştırılır.

## Kullanılan Teknolojiler
* Java (Encapsulation, Inheritance, Polymorphism, Abstraction)
* Java Collections (`ArrayList`)
