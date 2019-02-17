package pbo3_remed_10116049_m.ibad.guthwara_quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author ibadguthwara
 */

public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        SimpleDateFormat cdt = new SimpleDateFormat("EEEEEE, d MMM yyyy HH:mm:ss");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta")));
        return cdt.format(System.currentTimeMillis());
    }
}

