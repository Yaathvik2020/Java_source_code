Feature: Title of your feature

  @tag1
  Scenario: Data Table without Header Example
    Given display the value without header
      | krishnan | indhara | Bharathi | Karpakam | chinna | sabitha | Yaathvik | Arumugam | Nitheesh | Nirmal | jagatheesh |

  @tag2
  Scenario: Data Table with Header Example
    Given display the value with header
      | father   | mother  | child    |
      | krishnan | indhara | Bharathi |
   When I have eneternumber 46 and string "chinna" value
    And display the value Success

