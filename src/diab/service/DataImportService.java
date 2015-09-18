package diab.service;

import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service
public class DataImportService {
	
    private final Log logger = LogFactory.getLog(getClass());
    
    //grab data from the DAO functions and then use GSON to convert those model classes to JSON
    //need to modify data so only some of the class members are improted
    //only need to import BG and Insulin members
    public String getUsersData(){
	
    }

}


