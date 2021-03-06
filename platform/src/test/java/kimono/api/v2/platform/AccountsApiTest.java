/*
 * Platform API
 * Platform APIs provide access to core Kimono Platform resources and operations such as Accounts, Users, and Clouds.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.platform;

import kimono.api.v2.platform.ApiException;
import kimono.api.v2.platform.model.Account;
import kimono.api.v2.platform.model.AccountResponse;
import kimono.api.v2.platform.model.AccountsResponse;
import kimono.api.v2.platform.model.ErrorType;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * Create an Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() throws ApiException {
        Account account = null;
        AccountResponse response = api.createAccount(account);

        // TODO: test validations
    }
    
    /**
     * Delete an Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountTest() throws ApiException {
        java.util.UUID id = null;
        api.deleteAccount(id);

        // TODO: test validations
    }
    
    /**
     * Find an Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAccountTest() throws ApiException {
        java.util.UUID id = null;
        AccountResponse response = api.findAccount(id);

        // TODO: test validations
    }
    
    /**
     * Find your Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOwnAccountTest() throws ApiException {
        AccountResponse response = api.findOwnAccount();

        // TODO: test validations
    }
    
    /**
     * Get Accounts
     *
     * Get a list of Accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAccountsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        AccountsResponse response = api.listAccounts(page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Update an Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountTest() throws ApiException {
        java.util.UUID id = null;
        Account account = null;
        api.updateAccount(id, account);

        // TODO: test validations
    }
    
}
