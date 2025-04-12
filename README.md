# 📊 JavaFX KDV ve Kullanıcı Yönetim Paneli Uygulaması

Bu proje, JavaFX kullanarak geliştirilmiş bir masaüstü yönetim uygulamasıdır. Uygulama, kullanıcı yetkilendirme, KDV hesaplama, kullanıcı yönetimi, çoklu dil ve tema desteği gibi birçok özelliği barındırmaktadır. Proje, MVC mimarisiyle yapılandırılmıştır.

## 🎯 Proje Amacı

KDV hesaplamalarının yapılabildiği, kullanıcı yönetiminin sağlandığı ve sistem ayarlarının yönetilebildiği bir masaüstü uygulama geliştirmek. Bu uygulama, veri giriş personelleri, muhasebeciler ve yöneticiler tarafından kullanılabilir.

## 🧩 Uygulama Modülleri

### 1. Giriş ve Rol Bazlı Yetkilendirme
- BCrypt ile şifreleme
- Roller: `ADMIN`, `OPERATOR`, `USER`
- Her rol için özel arayüz

### 2. Kullanıcı Yönetimi
- Listeleme, filtreleme, ekleme, güncelleme, silme
- Rol atama ve şifre resetleme
- `TableView`, `TextField`, `ComboBox` kullanımı

### 3. KDV Hesaplama
- Tutar ve KDV oranına göre hesaplama
- TXT, PDF, Excel’e aktarma
- Yazdırma ve e-posta gönderme

### 4. Tema ve Dil Desteği
- Karanlık/Açık mod
- Türkçe/İngilizce dil desteği

### 5. Bildirim Sistemi
- Pop-up mesajlar (hata, başarı, bilgi)
- Bildirim geçmişi

### 6. Profil Yönetimi
- Bilgileri görüntüleme, güncelleme
- Şifre değişimi

### 7. Yedekleme ve Geri Yükleme
- JSON/XML ile veri yedekleme
- `FileChooser` ile yedek seçimi

### 8. Saat ve Tarih Gösterimi
- Canlı saat gösterimi (`Timeline` veya `ScheduledExecutorService`)

### 9. Not Defteri
- CRUD işlemleriyle kullanıcı not defteri
- Zamanlayıcı ile hatırlatma özelliği

## ➕ Ekstra Modüller (Opsiyonel)
- PieChart / BarChart ile grafiksel KDV raporları
- JSON API entegrasyonu
- WebView ile yardım dökümanı
- Yazdırma önizleme, güvenlik logları

## 🛠 Kullanılan Teknolojiler

| Katman     | Teknolojiler                           |
|------------|----------------------------------------|
| UI         | JavaFX, FXML, Internal CSS             |
| DB         | H2DB / SQLite (JDBC)                   |
| Güvenlik   | BCrypt                                 |
| Dışa Aktarım | Apache POI, PDFBox                   |
| Mail       | JavaMail API (opsiyonel)               |
| Zamanlama  | Timeline, ScheduledExecutorService     |
| Grafik     | JavaFX Chart                           |


## ✅ Gereksinimler ve Kurulum

- **JDK 17+**
- **IntelliJ IDEA / Eclipse**
- **SceneBuilder** (FXML dosyaları için)
- **H2DB jar** bağlantısı
- **Apache POI** ve **PDFBox** kütüphaneleri

### Kurulum Adımları

```bash
git clone https://github.com/kullanici-adi/proje-adi.git
cd proje-adi
