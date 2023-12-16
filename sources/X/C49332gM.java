package X;

import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement;
import java.util.List;
import org.whispersystems.jobqueue.JobParameters;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.2gM  reason: invalid class name and case insensitive filesystem */
public class C49332gM {
    public String A00 = null;
    public List A01 = AnonymousClass0x9.A18();
    public boolean A02 = false;

    public static C49332gM A00() {
        C49332gM r1 = new C49332gM();
        r1.A02 = true;
        r1.A05(new ChatConnectionRequirement());
        return r1;
    }

    public static C49332gM A01() {
        return new C49332gM();
    }

    public static JobParameters A02(C49332gM r1) {
        r1.A05(new OfflineProcessingCompletedRequirement());
        return r1.A04();
    }

    public static void A03(String str, C49332gM r1) {
        r1.A00 = str;
        r1.A02 = true;
        r1.A05(new ChatConnectionRequirement());
    }

    public JobParameters A04() {
        return new JobParameters(this.A00, this.A01, this.A02);
    }

    public void A05(Requirement requirement) {
        this.A01.add(requirement);
    }
}
