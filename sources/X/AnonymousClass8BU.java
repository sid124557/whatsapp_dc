package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8BU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8BU implements OnSuccessListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2M7 A01;

    public final void onSuccess(Object obj) {
        List<AnonymousClass6SE> asList;
        AnonymousClass2M7 r9 = this.A01;
        int i = this.A00;
        AnonymousClass6SN r0 = ((AnonymousClass8BA) ((C187758xl) ((C155737fQ) obj).A00)).A01;
        if (r0 == null) {
            asList = Collections.emptyList();
        } else {
            asList = Arrays.asList(r0.A03);
        }
        int size = asList.size();
        C18260x0.A0w("requestHarmfulApps/onSuccess/appsDataList size=", AnonymousClass001.A0o(), size);
        ArrayList A0s = AnonymousClass001.A0s();
        int i2 = 0;
        for (AnonymousClass6SE r1 : asList) {
            if (i2 >= i) {
                break;
            }
            A0s.add(new AnonymousClass7LK(r1.A01, C107575bX.A0E(r1.A02), r1.A00));
            i2++;
        }
        C48262ec r3 = r9.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        A0o.append(Integer.valueOf(A0s.size()));
        A0o.append(" errorCode=");
        A0o.append(0);
        C18260x0.A0s(" errorMessage=", (String) null, A0o);
        C56052rL r7 = new C56052rL("apps");
        r7.A0G(new AnonymousClass39V("actual_count", size));
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass7LK r5 = (AnonymousClass7LK) it.next();
            C56052rL r4 = new C56052rL("item");
            C56052rL.A0D(r4, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A01);
            C56052rL.A0D(r4, "hash", r5.A02);
            r4.A0G(new AnonymousClass39V("category", r5.A00));
            C56052rL.A07(r4, r7);
        }
        AnonymousClass36K A0F = r7.A0F();
        C56052rL r02 = new C56052rL("verify_apps");
        r02.A0H(A0F);
        AnonymousClass36K A0F2 = r02.A0F();
        C56052rL r03 = new C56052rL("ib");
        r03.A0H(A0F2);
        r3.A00.A0G(r03.A0F(), 273);
    }

    public /* synthetic */ AnonymousClass8BU(AnonymousClass2M7 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
