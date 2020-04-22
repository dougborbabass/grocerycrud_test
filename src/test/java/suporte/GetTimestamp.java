package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GetTimestamp {

    public static String dataHoraParaArquivo() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("ddMMyyyy-hhmmss").format(ts);
    }
}
