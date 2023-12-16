package X;

import com.whatsapp.data.ConversationDeleteWorker;
import java.util.Map;

/* renamed from: X.2ZW  reason: invalid class name */
public class AnonymousClass2ZW {
    public final C56982ss A00;
    public final C55792qv A01;
    public final C34171uL A02;

    public void A00(C43912Ty r7, String str) {
        AnonymousClass0Aw r5 = new AnonymousClass0Aw(ConversationDeleteWorker.class);
        AnonymousClass0Q9 r4 = new AnonymousClass0Q9();
        Map map = r4.A00;
        map.put("delete_action", str);
        AnonymousClass0x2.A1K("job_id", map, r7.A06);
        C18320x8.A1A(r4, r5);
        r5.A06(String.valueOf(r7.A07.hashCode()));
        r5.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        C72333dY.A01(this.A02).A08(r5.A00());
    }

    public AnonymousClass2ZW(C56982ss r1, C55792qv r2, C34171uL r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
