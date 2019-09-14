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
                            Integer Number = Integer.parseInt(row.get("Number"));
                            String User = row.get("User");
                            String Description = row.get("Description");

                            return new UserTableValue(Number, User, Description);
                        }
                )
        );
    }
}
