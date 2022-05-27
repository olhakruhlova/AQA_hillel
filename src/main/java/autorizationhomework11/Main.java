package autorizationhomework11;

public class Main {
    public static void main(String[] args) {

        boolean validationResult = InputValidatorValueOfFieldsInAuthorizationForm.validator("12334465", "7", "12334455666677888889990009999999512334465");
        System.out.println("Result of validation: " + validationResult);
    }
}
