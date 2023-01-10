Feature: Google Arama Feature

  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici "<aranacakKelime>" arattiginda
    Then Kullanici  title da "<dogrulanacakKelime>" gormelidir.


    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |