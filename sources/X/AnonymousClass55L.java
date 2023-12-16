package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.55L  reason: invalid class name */
public class AnonymousClass55L extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass5XL A00;

    public AnonymousClass55L(AnonymousClass5XL r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass39J r3;
        ArrayList A0J;
        C56762sW r7;
        AnonymousClass3ZF A01;
        AnonymousClass5XL r2 = this.A00;
        AnonymousClass5IP r1 = r2.A0B;
        Log.i("JoinableCallsMigrationManager/handleJoinableCallsDbMigration ");
        C106155Xv r9 = r1.A00;
        List A05 = r9.A05();
        if (!A05.isEmpty()) {
            Log.i("JoinableCallsMigrationManager/migrateJoinableCallsFromSharedPrefsToDb ");
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                long A0A = AnonymousClass0x2.A0A(r9.A03(), AnonymousClass000.A0V("joinable_", A0m, AnonymousClass001.A0o()));
                if (!(A0A == -1 || (A01 = r7.A01(A0A)) == null || A01.A07 == null)) {
                    A01.A0J(new C53312mt(A01.A05, C627436k.A08(A0m), A01.A05(), A01.A0L));
                    (r7 = r1.A01).A06(A01);
                }
                r9.A07(A0m);
            }
        }
        AnonymousClass93O r8 = new AnonymousClass93O(this, 1);
        C56762sW r72 = r2.A0H;
        ArrayList A04 = r72.A04(r8, 0, 100);
        AnonymousClass4MC r21 = this.A02;
        ArrayList arrayList = null;
        if (!r21.isCancelled()) {
            Log.i("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/doInBackground");
            try {
                r3 = C627436k.A03();
            } catch (UnsatisfiedLinkError e) {
                Log.e((Throwable) e);
                r3 = null;
            }
            AnonymousClass1VX r17 = r2.A0J;
            C66493Lq r15 = r2.A0K;
            C56572sD r14 = r2.A0P;
            C56572sD r20 = r14;
            C56612sH r172 = r2.A0G;
            AnonymousClass5XE r12 = new AnonymousClass5XE(r2.A09, r1, r2.A0C, r2.A0F, r172, r17, r15, r20);
            r2.A05 = r12;
            r12.A01(r3, A04);
            List list = r2.A05.A08;
            synchronized (list) {
                arrayList = AnonymousClass002.A0J(list);
            }
            if (A04.size() >= 100) {
                A0F(arrayList);
                ArrayList A042 = r72.A04(r8, 100, r2.A01);
                if (r21.isCancelled()) {
                    return null;
                }
                r2.A05.A01(r3, A042);
                List list2 = r2.A05.A08;
                synchronized (list2) {
                    A0J = AnonymousClass002.A0J(list2);
                }
                return A0J;
            }
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/onPostExecute db read callGroup count: ");
        C18260x0.A1F(A0o, C86614Ku.A08(list));
        AnonymousClass5XL r1 = this.A00;
        r1.A03 = null;
        AnonymousClass5XL.A00(r1, list);
    }
}
