package X;

import android.content.Context;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.47K  reason: invalid class name */
public final class AnonymousClass47K extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56942so A00;
    public transient MemberSuggestedGroupsManager A01;
    public transient AnonymousClass2WQ A02;
    public final transient C27991fJ A03;
    public final String parentGroupRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass47K(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 1
            X.C162457s7.A0J(r4, r2)
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "community-fetch-all-subgroup-suggestions"
            r1.A00 = r0
            r1.A02 = r2
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r3.<init>(r0)
            r3.parentGroupRawJid = r4
            X.1fJ r0 = X.AnonymousClass34R.A05(r4)
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47K.<init>(java.lang.String):void");
    }

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        C64333Db A012 = C389229y.A01(applicationContext);
        this.A02 = A012.AnU();
        this.A00 = C64333Db.A1k(A012);
        this.A01 = (MemberSuggestedGroupsManager) A012.AKB.get();
    }

    public final String A08() {
        Boolean bool;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("persistentId=");
        A0o.append(this.A01);
        A0o.append("; groupJid=");
        A0o.append(this.A03);
        A0o.append("; useMex=");
        AnonymousClass2WQ r0 = this.A02;
        if (r0 != null) {
            bool = Boolean.valueOf(r0.A00());
        } else {
            bool = null;
        }
        return AnonymousClass000.A0R(bool, A0o);
    }
}
