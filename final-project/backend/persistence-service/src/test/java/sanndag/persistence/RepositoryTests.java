package sanndag.persistence;

//@SpringBootTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@DataJpaTest
public class RepositoryTests {

//    @Autowired
//    ProfessionRepository professionRepository;
//
//    @Autowired
//    CompanyRepository companyRepository;
//
//    @Autowired
//    PersonRepository personRepository;
//
//    @Test
//    public void testCreateReadDelete(){
//
//        ProfessionEntity professionEntity = new ProfessionEntity();
//        professionEntity.setName("Software Developer");
//
//        professionRepository.save(professionEntity);
//
//        CompanyEntity companyEntity = new CompanyEntity();
//        companyEntity.setName("TechSolutions Innovate");
//
//        PersonEntity person = new PersonEntity();
//        person.setName("Roberto");
//        person.setLastname("Sanchez");
//        person.setDni("6454665");
//        person.setAddress("Rio Negro 456");
//        person.setCity("Cipolletti");
//        person.setState("Santa Fe");
//        person.setCountry("Argentina");
//        person.setProfessionEntity(professionEntity);
//        person.setCompanyEntity(companyEntity);
//
//        personRepository.save(person);
//
//        // Read the PersonEntity
//        //PersonEntity retrievedPerson = personRepository.findById(person.getId()).orElse(null);
//        // Add assertions to check if the retrievedPerson matches the saved person
//        Iterable<PersonEntity> personEntity = personRepository.findAll();
//        Assertions.assertThat(personEntity).extracting(PersonEntity::getName).containsOnly("Roberto");
//
//        // Delete the PersonEntity
//        personRepository.delete(person);

        // Verify that the entity has been deleted
        //retrievedPerson = personRepository.findById(person.getId()).orElse(null);
        // Add assertions to check if retrievedPerson is null after deletion


   // }
}
