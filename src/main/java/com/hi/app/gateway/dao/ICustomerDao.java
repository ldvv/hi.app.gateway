package hi.app.gateway.dao;

import hi.app.gateway.vo.CustomerDB;
import hi.app.gateway.vo.ErrorInfo;

import java.util.List;

public interface ICustomerDao {

    void updateToDB(List<CustomerDB> cusDbs);

    void insertError(ErrorInfo errorInfo);
}
