package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.concurrent.Executor;

/* renamed from: X.9Rw  reason: invalid class name and case insensitive filesystem */
public class C194179Rw {
    public C56512s6 A00;
    public final Context A01;
    public final C69263Wi A02;
    public final C620033c A03;
    public final C40602Ha A04;
    public final AnonymousClass9U5 A05;
    public final AnonymousClass9VU A06;
    public final AnonymousClass4FS A07;

    public void A00(C67993Rl r18, C193719Ps r19, C633138t r20, File file) {
        C193719Ps r3 = r19;
        if (Build.VERSION.SDK_INT < 26) {
            this.A02.A08.execute(new C198999fp(r3));
            return;
        }
        try {
            File A002 = this.A00.A00().A00("enc");
            new FileOutputStream(A002).write(C1899693i.A12(r18, Files.readAllBytes(file.toPath())));
            AnonymousClass3QO A032 = this.A03.A03(AnonymousClass32J.A00(Uri.fromFile(A002), (AnonymousClass32B) null, new C151027Td(SearchActionVerificationClientService.NOTIFICATION_ID, 100, 1600, 1600), new C157497iO(true, false, true), r20, (AnonymousClass330) null, (String) null, 0, false, false, false), true);
            A032.A0W = "mms";
            A032.A04(new C204999qG(r3, A032, this, 1), (Executor) null);
            this.A07.BkM(new C200139hq(A032, this));
        } catch (Exception unused) {
            Log.e("PAY: PaymentsComplianceMediaUploadManager encryption failure");
            this.A02.A08.execute(new C199009fq(r3));
        }
    }

    public C194179Rw(Context context, C69263Wi r2, C620033c r3, C40602Ha r4, AnonymousClass9U5 r5, AnonymousClass9VU r6, AnonymousClass4FS r7) {
        this.A01 = context;
        this.A02 = r2;
        this.A07 = r7;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
    }
}
