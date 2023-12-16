package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.4KG  reason: invalid class name */
public class AnonymousClass4KG implements AnonymousClass4C1 {
    public Object A00;
    public final int A01;

    public AnonymousClass4KG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        switch (this.A01) {
            case 0:
                return ((C183538qC) this.A00).get();
            case 4:
            case 5:
            case 6:
            case 7:
                return this.A00;
            case 8:
            case 9:
            case 10:
                return new C26931d0((C67163Of) this.A00);
            case 11:
                return ((AnonymousClass310) this.A00).A05();
            case 12:
                return ((C54402of) this.A00).A01.A03("extensions_prefs");
            case 13:
                return ((C60152y5) this.A00).A03(AnonymousClass33p.A05);
            case 14:
                return C389229y.A01(((C54292oU) this.A00).A00).AcK.A00.AQu();
            case 15:
                int[][] iArr = (int[][]) this.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("emojipickerdata/initialize emoji list of size ");
                int length = iArr.length;
                C18260x0.A1F(A0o, length);
                ArrayList A0I = AnonymousClass002.A0I(length);
                for (int i = 0; i < length; i++) {
                    C18280x3.A1L(A0I, iArr, i);
                }
                return A0I;
            case 16:
                return new PorterDuffColorFilter(C54292oU.A00((C54292oU) this.A00).getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
            case 17:
                try {
                    return C172228Ke.A00((AnonymousClass7EN) null, AnonymousClass002.A0A(C54292oU.A02(((C59652xG) this.A00).A02), "extensions_reporting_cache_dir"), 10485760);
                } catch (IOException e) {
                    C18260x0.A16("ExtensionsLogger/ExtensionsReportingDiskCache/init: ", AnonymousClass001.A0o(), e);
                    return null;
                }
            case 18:
                return new C66793Mu((AnonymousClass4GR) this.A00);
            case 20:
                return new AnonymousClass1f0((C49062fv) ((C183538qC) this.A00).get());
            case 21:
                return new AnonymousClass1f1(AnonymousClass000.A0A(), (C620633i) ((C183538qC) this.A00).get());
            case 22:
                return ((AnonymousClass2H4) this.A00).A00.B18("DocumentCheckQueue", new LinkedBlockingQueue(), 1, 1, 1, 0);
            case 23:
                ThreadPoolExecutor B18 = ((AnonymousClass4FS) this.A00).B18("FileDownloadQueue", new LinkedBlockingQueue(), 1, 1, 10, 5);
                B18.allowCoreThreadTimeOut(true);
                return B18;
            case 24:
                AnonymousClass1I7 r1 = (AnonymousClass1I7) ((AnonymousClass4IX) this.A00).A01;
                C54292oU r6 = r1.A0O;
                return new C158207jb(r1.A0A, r1.A0D, r1.A0F, r6, r1.A0e.A0C, r1.A0o.A01());
            case 25:
                ThreadPoolExecutor B182 = ((AnonymousClass4FS) this.A00).B18("MediaDownload", new PriorityBlockingQueue(), 1, 1, 10, 60);
                B182.allowCoreThreadTimeOut(true);
                return B182;
            case 26:
                ThreadPoolExecutor B183 = ((AnonymousClass4FS) this.A00).B18("ThumbnailDownloadQueue", new LinkedBlockingQueue(), 1, 2, 10, 5);
                B183.allowCoreThreadTimeOut(true);
                return B183;
            case 27:
                ThreadPoolExecutor B184 = ((AnonymousClass4FS) this.A00).B18("MediaUploadQueue", new LinkedBlockingQueue(), 10, 10, 1, 5);
                B184.allowCoreThreadTimeOut(true);
                return B184;
            case 28:
                return ((C56022rI) this.A00).A01.A03("migration_export");
            case 30:
                return new AnonymousClass3WO((AnonymousClass4GS) this.A00);
            case 31:
                return new AnonymousClass3WN((AnonymousClass4GR) this.A00);
            case 32:
                Log.i("externalfilevalidator/initializing allowlist lazily");
                C64393Dh r4 = (C64393Dh) ((AnonymousClass306) this.A00).A01.get();
                HashSet A0K = AnonymousClass002.A0K();
                A0K.add(C64393Dh.A01(C54292oU.A01(r4), "Stickers"));
                A0K.add(r4.A0B());
                A0K.add(r4.A0C());
                A0K.add(r4.A0Q("personal"));
                A0K.add(r4.A0Q("business"));
                C54292oU r2 = r4.A01;
                A0K.add(C64393Dh.A02(C54292oU.A02(r2), "export_business_activity"));
                File file = r4.A08().A09;
                C64393Dh.A07(file, false);
                A0K.add(file);
                Context context = r2.A00;
                A0K.add(C64393Dh.A01(context.getFilesDir(), "Gifs"));
                A0K.add(C64393Dh.A01(context.getCacheDir(), "stickers_cache"));
                A0K.add(r4.A08().A08);
                A0K.add(r4.A08().A06);
                A0K.add(r4.A08().A07);
                return Collections.unmodifiableSet(A0K);
            case 33:
                return C06310Xb.A01((Context) this.A00);
            default:
                return ((AnonymousClass4C1) this.A00).get();
        }
    }
}
