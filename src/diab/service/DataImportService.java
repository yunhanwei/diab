package diab.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

import diab.model.Insulin;
import diab.model.BG;
import diab.dao.InsulinDAO;
import diab.dao.BGDAO;

@Service
public class DataImportService {
	
    private final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private InsulinDAO insulinDAO;
    @Autowired
	private BGDAO bGDAO; 

	public String insulinJSON;
	public String BGJSON;


    //grab data from the DAO functions and then use GSON to convert those model classes to JSON
    //need to modify data so only some of the class members are improted
    //only need to import BG and Insulin members

    //may not use this function and just directly call 
    public void getUsersData(){

    	String insulinJSON;
    	insulinJSON = this.importInsulinData();

    }

    public String importInsulinData(){
		List<Insulin> insulinList = new List<Insulin>();
		Gson g = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

    	insulinList = insulinDAO.returnVals();

    	for (int a = 0; a<insulinList.size(); a++){
    		this.insulinJSON.add(g.toJson(insulinList[a]));
    	}
    }

    public String importBGData(){
        List<BG> BGList = new List<Insulin>();
        Gson g = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        BGList = bGDAO.returnVals();

        for (int a = 0; a<BGList.size(); a++){
            this.BGJSON.add(g.toJson(BGList[a]));
        }
    }

}


