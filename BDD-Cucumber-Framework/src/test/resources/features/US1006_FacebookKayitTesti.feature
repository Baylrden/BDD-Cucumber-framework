

  Feature: Facebook sign up form

    @wip
    Scenario: TC14 filling sign up with valid informations
      Given user redirecting to "googleUrl"
      And facebook'da yeni hesap olustur butonuna basar
      And waits for 1 seconds
      When Faker class'indan bilgilerle facebook kayit formunu doldurur
      Then waits for 2 seconds
      And facebook kayit ol butonuna basar
      Then waits for 2 seconds
      And closes the page