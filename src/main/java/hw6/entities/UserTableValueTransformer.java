package hw6.entities;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;


public class UserTableValueTransformer implements TypeRegistryConfigurer {

    public Locale locale() {
        return Locale.ENGLISH;
    }

    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(UserTableValue.class,
                        (Map<String, String> row) -> {
                            String Number = row.get("number");
                            String User = row.get("user");
                            String Description = row.get("description");

                            return new UserTableValue(Number, User, Description);
                        }
                )
        );
    }
}
