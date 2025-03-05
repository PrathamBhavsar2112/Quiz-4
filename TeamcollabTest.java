package Test;

class TeamcollabTest {

    @Test
    void AssignTask() {
        Teamcollab tc = new TeamCollab();
        boolean result = tc.assingtask(true);
        assertTrue("Task assingn correctly", result);
    }

    @Test
    void AssignTask(Sting Person) {
        Teamcollab tc = new TeamCollab();
        boolean assign = tc.assingtask('bob') ;
        assertEquals("bob", assign);
    }
    

    @Test
    void UpdateStatusTest(){
        Teamcollab tc = new TeamCollab();
        boolean update = tc.updatestatus();
        assertTrue("Task Updated", update);
    }
 
}