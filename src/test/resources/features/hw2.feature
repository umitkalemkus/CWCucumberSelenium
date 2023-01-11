Feature: Butun url


Scenario Outline: TC05 dinamik urller
Given Kullanici "<page_url>" sayfasına gider
Then Kullanici 12 sn bekler
And Sayfa basliginin "<kelime>" icerdigini test eder
And Sayfayi kapatir

Examples:
| page_url     | kelime   |
| google_url   | Google   |
| amazon_url   | Amazon   |
| trendyol_url | Trendyol |