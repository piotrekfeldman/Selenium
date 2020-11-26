package inheritanceConcept;

public class DocumentItem extends Item {

    @Override
    public String getName() {
        return (String) super.getName();
    }
}
