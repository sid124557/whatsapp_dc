package X;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;

/* renamed from: X.8BG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BG implements C181138mD {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;

    public final Object Bqf(Task task) {
        Task task2;
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String A012 = FirebaseInstanceId.A01();
        C156537gn A002 = FirebaseInstanceId.A00(str, str2);
        if (!firebaseInstanceId.A0B(A002)) {
            C146677Be r0 = new C146677Be(A002.A01);
            AnonymousClass6YV r8 = new AnonymousClass6YV();
            r8.A04(r0);
            return r8;
        }
        AnonymousClass7GV r6 = firebaseInstanceId.A04;
        AnonymousClass7ML r4 = new AnonymousClass7ML(firebaseInstanceId, A012, str, str2);
        synchronized (r6) {
            Pair A0C = AnonymousClass0x9.A0C(str, str2);
            Map map = r6.A00;
            task2 = (Task) map.get(A0C);
            if (task2 == null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(A0C);
                    AnonymousClass6C7.A1G("Making new request for: ", valueOf, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf.length() + 24));
                }
                FirebaseInstanceId firebaseInstanceId2 = r4.A00;
                String str3 = r4.A01;
                String str4 = r4.A02;
                String str5 = r4.A03;
                C151127Tn r3 = firebaseInstanceId2.A06;
                task2 = r3.A00(AnonymousClass002.A08(), str3, str4, str5).continueWith(r3.A04, new AnonymousClass8BE(r3)).onSuccessTask(firebaseInstanceId2.A07, new AnonymousClass8BW(firebaseInstanceId2, str4, str5, str3)).continueWithTask(r6.A01, new AnonymousClass8BF(A0C, r6));
                map.put(A0C, task2);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(A0C);
                AnonymousClass6C7.A1G("Joining ongoing request for: ", valueOf2, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf2.length() + 29));
            }
        }
        return task2;
    }

    public AnonymousClass8BG(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
    }
}
