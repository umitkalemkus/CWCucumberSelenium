Feature: User Login HRM with dataTable

   @ValidCredentials
  Scenario: TC07_Baslikli datatable
    Given kullanici HRMLogin sayfasina gider
    When kullanici valid credentials girer
      | admin_id | admin_pass |
      | Admin    | admin123   |

   @inValidCredentials
  Scenario: TC08_Baslikli coklu satir datatable
    Given kullanici HRMLogin sayfasina gider
    When kullanici invalid credentials girer
      | admin_id | admin_pass | error_message       |
      | Admin1   | admin123!  | Invalid credentials |
      | Admina   | admin123a  | Invalid credentials |
