package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Fb  reason: invalid class name and case insensitive filesystem */
public class C64803Fb implements AnonymousClass4E8 {
    public C106155Xv A00;
    public AnonymousClass364 A01;
    public C622334f A02;
    public C54292oU A03;
    public C54882pR A04;
    public AnonymousClass2YR A05;
    public C55812qx A06;
    public C59792xU A07;
    public C43892Tw A08;
    public C103735Of A09;
    public AnonymousClass4FS A0A;

    public void BQW() {
        File[] listFiles;
        C69833Yo Axl;
        C69833Yo Axl2;
        C55812qx r5 = this.A06;
        synchronized (r5) {
            C626936e.A00();
            r5.A00.A07(-1);
            try {
                C85284Fq A0C = r5.A02.A0C();
                try {
                    Axl2 = A0C.Axl();
                    C56862sg r8 = ((AnonymousClass3H0) A0C).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    C18260x0.A1X(A1Y, r5.A01.A0H() - 1209600000);
                    r8.A07("media_job", "last_update_time < ?", "MediaJobDataStore/deleteStaleMediaJobData", A1Y);
                    Axl2.A00();
                    Axl2.close();
                    A0C.close();
                } catch (Throwable th) {
                    A0C.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("mediajobdb/delete All Older than", e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        AnonymousClass2YR r52 = this.A05;
        synchronized (r52) {
            C626936e.A00();
            try {
                C85284Fq A0C2 = r52.A01.A0C();
                try {
                    Axl = A0C2.Axl();
                    C56862sg r82 = ((AnonymousClass3H0) A0C2).A03;
                    String[] A1Y2 = AnonymousClass0x9.A1Y();
                    C18260x0.A1X(A1Y2, r52.A00.A0H() - 300000);
                    r82.A07("express_path_download_data", "last_update_time < ?", "ExpressPathDownloadDataStore/deleteStaleExpressPathDownloadData", A1Y2);
                    Axl.A00();
                    Axl.close();
                    A0C2.close();
                } catch (Throwable th3) {
                    A0C2.close();
                    throw th3;
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                Log.e("expresspathdownloaddb/delete All Older than", e2);
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
        }
        Context context = this.A03.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        HashMap hashMap = C34051u9.A0A;
        synchronized (hashMap) {
            Iterator A11 = C18290x4.A11(hashMap);
            while (A11.hasNext()) {
                C34051u9 r2 = (C34051u9) hashMap.get(C18300x5.A0P(A11));
                if (r2 != null) {
                    if (r2.A06() != 1) {
                        C18270x1.A0x(C34051u9.A00(context, r2));
                        A0s.add(r2);
                    } else {
                        File A002 = C34051u9.A00(context, r2);
                        if (A002.exists()) {
                            A0s2.add(A002);
                        }
                    }
                }
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                hashMap.remove(((C34051u9) it.next()).A05.A03);
            }
        }
        File[] listFiles2 = AnonymousClass0x7.A0e(context.getCacheDir(), "ProfilePictureTemp").listFiles();
        if (listFiles2 != null) {
            for (File file : listFiles2) {
                if (!A0s2.contains(file)) {
                    file.delete();
                }
            }
        }
        C59792xU r1 = this.A07;
        Context context2 = this.A03.A00;
        Log.d("ProfilePicturePlainFileDownloadManager/cleanupOrphanedDownloads");
        ArrayList A0s3 = AnonymousClass001.A0s();
        ArrayList A0s4 = AnonymousClass001.A0s();
        HashMap hashMap2 = r1.A0A;
        synchronized (hashMap2) {
            Iterator A0u = AnonymousClass001.A0u(hashMap2);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                AnonymousClass1g1 r12 = (AnonymousClass1g1) A0w.getValue();
                if (r12 != null) {
                    if (!r12.A0A) {
                        AnonymousClass2T0 r0 = r12.A05;
                        C18270x1.A0x(C59792xU.A00(context2, r0.A04, r0.A06, r0.A02));
                        A0s3.add(C18310x6.A0q(A0w));
                    } else {
                        AnonymousClass2T0 r02 = r12.A05;
                        File A003 = C59792xU.A00(context2, r02.A04, r02.A06, r02.A02);
                        if (A003.exists()) {
                            A0s4.add(A003);
                        }
                    }
                }
            }
            Iterator it2 = A0s3.iterator();
            while (it2.hasNext()) {
                hashMap2.remove(AnonymousClass001.A0m(it2));
            }
        }
        File[] listFiles3 = AnonymousClass0x7.A0e(context2.getCacheDir(), "ProfilePictureTemp").listFiles();
        if (listFiles3 != null) {
            for (File file2 : listFiles3) {
                if (!A0s4.contains(file2)) {
                    C627536m.A0O(file2);
                }
            }
        }
        C18270x1.A0g(this.A00.A03().edit(), "enable_gcall_codec_nego_fix");
        File A042 = C627436k.A04(this.A01.A03.A00);
        if (A042 != null && (listFiles = A042.listFiles()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file3 : listFiles) {
                long lastModified = currentTimeMillis - file3.lastModified();
                if (lastModified > AnonymousClass0x7.A0B() || lastModified < 0) {
                    C627536m.A0P(file3);
                }
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void BQX() {
        C71533cG.A00(this.A0A, this, 4);
        C43892Tw r5 = this.A08;
        if (r5.A08.A0Y(C58422vE.A02, 394)) {
            C25781b4 r4 = new C25781b4();
            AnonymousClass5ZC r3 = r4.samplingRate;
            if (r3.A00()) {
                r5.A0B.BkM(new C70363aN(r5, r4, r3, 16));
            }
        }
        C103735Of r32 = this.A09;
        Log.i("storage-usage-prefetcher/prefetch storage data");
        r32.A06.BkM(new C117635sF(r32, 40));
    }

    public String BDW() {
        return "LegacyDailyCron";
    }
}
