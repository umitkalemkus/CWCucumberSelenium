Feature: Google search test

  Scenario: Google da bir kelime arandiginda ilgili kelimeyi barindiran sonuclar goruntulenmelidir
    Given Kullanici google sayfasindadir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular.