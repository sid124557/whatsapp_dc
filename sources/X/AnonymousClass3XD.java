package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3XD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XD implements C84144Be {
    public final /* synthetic */ AnonymousClass5ZT A00;

    public final void AyM(Object obj) {
        C633138t r13;
        AnonymousClass5ZT r2 = this.A00;
        File file = (File) obj;
        C56232re r5 = r2.A0x;
        C95814uZ r7 = r2.A0E;
        Log.i("app/mediajobmanager/enqueuevoicenoteupload enqueuing file ");
        C157497iO r12 = new C157497iO(true, false, true);
        if (r7 instanceof C95804uY) {
            r13 = C633138t.A0S;
        } else {
            r13 = C633138t.A0J;
        }
        AnonymousClass32J A002 = AnonymousClass32J.A00(Uri.fromFile(file), (AnonymousClass32B) null, (C151027Td) null, r12, r13, (AnonymousClass330) null, (String) null, 1, false, false, true);
        C620033c r4 = r5.A0D;
        AnonymousClass3QO A03 = r4.A03(A002, true);
        C619833a r1 = A03.A0M;
        r1.A09(2);
        r1.A07();
        A03.A0W = "mms";
        A03.A09.A05(new AnonymousClass2QG(file, false));
        A03.A01 = AnonymousClass368.A01(r7, false);
        A03.A04(new C86264Jl(r5, 9, A03), r5.A0V);
        C135406kc r0 = new C135406kc(A03, A03.A00());
        r4.A0A(A03, r0);
        r2.A0F = r0;
    }

    public /* synthetic */ AnonymousClass3XD(AnonymousClass5ZT r1) {
        this.A00 = r1;
    }
}
