package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String sqlgetLevel   = "{call getLevel(?)}";

    /** The sql example by name. */
    private static String sqlExampleByName = "{call findExampleByName(?)}";

    /** The sql all examples. */
    private static String sqlAllExamples   = "{call findAllExamples()}";

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    coxColumnIndex  = 2;
    
    private static int    coyColumnIndex  = 3;
    
    private static int    Nom_ElementColumnIndex  = 4;
    
    private static int    ID_MapColumnIndex  = 5;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
   /* public static Example getExampleById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleById);
        Example example = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }*/

    
    public static List <Example> getLevel(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlgetLevel);
        ArrayList <Example> retour = new ArrayList<Example>() ;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                retour.add( new Example(result.getInt(coxColumnIndex),result.getInt(coyColumnIndex),result.getInt(ID_MapColumnIndex),result.getString(Nom_ElementColumnIndex)));
            }
            result.close();
        }
        return retour;
    }
    
    
    
   
}
