import java.util.List;
import java.io.UnsupportedEncodingException;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.TException;
import org.apache.cassandra.service.*;

public class CClient
{
    public static void main(String[] args)
    throws TException, InvalidRequestException, UnavailableException, UnsupportedEncodingException, NotFoundException
    {
        TTransport tr = new TSocket("localhost", 9160);
        TProtocol proto = new TBinaryProtocol(tr);
        Cassandra.Client client = new Cassandra.Client(proto);
        tr.open();

        String key_user_id = "1";

        // insert data
        long timestamp = System.currentTimeMillis();
        client.insert("Keyspace1",
                      key_user_id,
                      new ColumnPath("Standard1", null, "name".getBytes("UTF-8")),
                      "Chris Goffinet".getBytes("UTF-8"),
                      timestamp,
                      ConsistencyLevel.ONE);
        client.insert("Keyspace1",
                      key_user_id,
                      new ColumnPath("Standard1", null, "age".getBytes("UTF-8")),
                      "24".getBytes("UTF-8"),
                      timestamp,
                      ConsistencyLevel.ONE);

        // read single column
        ColumnPath path = new ColumnPath("Standard1", null, "name".getBytes("UTF-8"));
        System.out.println(client.get("Keyspace1", key_user_id, path, ConsistencyLevel.ONE));

        // read entire row
        SlicePredicate predicate = new SlicePredicate(null, new SliceRange(new byte[0], new byte[0], false, 10));
        ColumnParent parent = new ColumnParent("Standard1", null);
        List<ColumnOrSuperColumn> results = client.get_slice("Keyspace1", key_user_id, parent, predicate, ConsistencyLevel.ONE);
        for (ColumnOrSuperColumn result : results)
        {
            Column column = result.column;
            System.out.println(new String(column.name, "UTF-8") + " -> " + new String(column.value, "UTF-8"));
        }

        tr.close();
    }
}