package X;

import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9qU  reason: invalid class name and case insensitive filesystem */
public class C205139qU implements AnonymousClass4EZ {
    public Object A00;
    public final int A01;

    public C205139qU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass94v r7, int i) {
        r7.A03.A0F(i, r7.A02.A0H() + TimeUnit.DAYS.toMillis(1));
    }

    public void BQs(String str) {
        if (this.A01 != 0) {
            AnonymousClass94v r3 = (AnonymousClass94v) this.A00;
            AnonymousClass08M r2 = r3.A00;
            C201679kY r1 = new C201679kY(0, "No Internet!");
            AnonymousClass9TO r0 = r3.A07;
            r2.A0G(AnonymousClass9WE.A02(new C193739Pu(R.string.f11nameremoved, R.string.f11nameremoved, r0.A00(0, 500), r0.A01(0, 500), 0, 500), r1));
        }
    }

    public void BSN(AnonymousClass36K r6, String str) {
        if (this.A01 != 0) {
            try {
                AnonymousClass36K A0l = r6.A0l("error");
                C626936e.A07(A0l, AnonymousClass000.A0X(" not found!", AnonymousClass000.A0l("error")));
                int A0b = A0l.A0b("code", 500);
                ((AnonymousClass94v) this.A00).A0D(new C201679kY(A0b, A0l.A0r("text", "Unknown!")), A0b);
            } catch (AnonymousClass24Y | NullPointerException e) {
                ((AnonymousClass94v) this.A00).A0D(e, 500);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ 24Y | NullPointerException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c A[Catch:{ 24Y | NullPointerException -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r11, java.lang.String r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "account"
            X.36K r2 = r11.A0l(r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.String r1 = " not found!"
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            X.C626936e.A07(r2, r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.String r0 = "link"
            X.36K r3 = r2.A0l(r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r1)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            X.C626936e.A07(r3, r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.String r0 = "status"
            r1 = 0
            int r2 = r3.A0b(r0, r1)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.String r0 = "redirection_type"
            int r8 = r3.A0b(r0, r1)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.Object r4 = r10.A00     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            X.94v r4 = (X.AnonymousClass94v) r4     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            r3 = 1
            if (r2 != r3) goto L_0x0084
            r9 = 0
            if (r8 == 0) goto L_0x0044
            r0 = 2
            if (r8 == r3) goto L_0x004f
            if (r8 != r0) goto L_0x0047
            A00(r4, r3)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            goto L_0x0052
        L_0x0044:
            A00(r4, r1)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
        L_0x0047:
            java.lang.String r1 = "ViralityLinkViewModel"
            java.lang.String r0 = "postSuccessResult: unsupported redirection type"
            X.C1899593h.A1Q(r1, r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            goto L_0x0052
        L_0x004f:
            A00(r4, r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
        L_0x0052:
            X.08M r2 = r4.A00     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            X.9TO r1 = r4.A07     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            boolean r0 = r1 instanceof X.C191699Fy     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            r4 = 2131895141(0x7f122365, float:1.9425107E38)
            if (r0 == 0) goto L_0x006c
            if (r8 != r3) goto L_0x0066
            r4 = 2131887020(0x7f1203ac, float:1.9408635E38)
        L_0x0062:
            r5 = 2131887019(0x7f1203ab, float:1.9408633E38)
            goto L_0x006f
        L_0x0066:
            r5 = 2131895140(0x7f122364, float:1.9425105E38)
            if (r8 != r3) goto L_0x006f
            goto L_0x0062
        L_0x006c:
            r5 = 2131895140(0x7f122364, float:1.9425105E38)
        L_0x006f:
            int r6 = r1.A00(r8, r9)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            int r7 = r1.A01(r8, r9)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            X.9Pu r3 = new X.9Pu     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            X.9WE r0 = X.AnonymousClass9WE.A01(r3)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            r2.A0G(r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            return
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            java.lang.String r0 = "Status is "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r2)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            r0 = 500(0x1f4, float:7.0E-43)
            r4.A0D(r1, r0)     // Catch:{ 24Y | NullPointerException -> 0x0094 }
            return
        L_0x0094:
            r2 = move-exception
            java.lang.Object r1 = r10.A00
            X.94v r1 = (X.AnonymousClass94v) r1
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A0D(r2, r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C205139qU.BdM(X.36K, java.lang.String):void");
    }
}
