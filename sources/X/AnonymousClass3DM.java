package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.3DM  reason: invalid class name */
public class AnonymousClass3DM implements AnonymousClass66U {
    public final C29171iO A00;
    public final C55682qk A01;
    public final AnonymousClass5XU A02;
    public final C66663Mh A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass1VX A07;
    public final C60152y5 A08;
    public final AnonymousClass4FS A09;
    public volatile C44062Un A0A;

    public File A00() {
        File A0A2 = AnonymousClass002.A0A(C54292oU.A03(this.A05), "crash_in_video_sentinel");
        if (!A0A2.createNewFile()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(A0A2, "mediatranscodequeue/failed-to-create/", A0o);
            AnonymousClass0x2.A19(A0o);
        }
        return A0A2;
    }

    public void A01() {
        File A0A2 = AnonymousClass002.A0A(C54292oU.A03(this.A05), "crash_in_video_sentinel");
        if (A0A2.exists() && !A0A2.delete()) {
            Log.w("crashlogs/failed-delete-crash-sentinel-file");
        }
    }

    public void A02() {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        C66663Mh r2 = this.A03;
        if (r2.A08(C66663Mh.A0C)) {
            File A0A2 = AnonymousClass002.A0A(C54292oU.A03(this.A05), "crash_counter");
            int[] iArr = new int[2];
            try {
                if (!A0A2.exists()) {
                    A0A2.createNewFile();
                } else {
                    try {
                        objectInputStream = new ObjectInputStream(AnonymousClass0x9.A0g(A0A2));
                        String[] split = ((String) objectInputStream.readObject()).split(",");
                        for (int i = 0; i < split.length; i++) {
                            iArr[i] = Integer.parseInt(split[i]);
                        }
                        objectInputStream.close();
                    } catch (Exception e) {
                        Log.e("Unable to read from crash counter file", e);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                if (this.A00.A00) {
                    iArr[0] = iArr[0] + 1;
                } else {
                    iArr[1] = iArr[1] + 1;
                }
                objectOutputStream = new ObjectOutputStream(AnonymousClass0x9.A0h(A0A2));
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(iArr[0]);
                A0o.append(",");
                objectOutputStream.writeObject(AnonymousClass000.A0h(A0o, iArr[1]));
                objectOutputStream.close();
                if (C18270x1.A0A(C18330xA.A04(this.A08.A00.getFilesDir().getParent(), "shared_prefs"), ".xml", AnonymousClass000.A0l("ab-props-backup")).exists()) {
                    if (iArr[0] >= r2.A03(C66663Mh.A12)) {
                        C55682qk r7 = this.A01;
                        StringBuilder A0l = AnonymousClass000.A0l("Crashes count foreground: ");
                        A0l.append(iArr[0]);
                        A0l.append(" Crashes count background: ");
                        r7.A0A("ForegroundAppCrashLoop", false, AnonymousClass000.A0h(A0l, iArr[1]));
                    } else if (iArr[1] >= r2.A03(C66663Mh.A11)) {
                        C55682qk r72 = this.A01;
                        StringBuilder A0l2 = AnonymousClass000.A0l("Crashes count foreground: ");
                        A0l2.append(iArr[0]);
                        A0l2.append(" Crashes count background: ");
                        r72.A0A("BackgroundAppCrashLoop", false, AnonymousClass000.A0h(A0l2, iArr[1]));
                    }
                }
            } catch (Exception e2) {
                Log.e("Unable to use crash counter file", e2);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            if (r2.A08(C66663Mh.A0B)) {
                Context context = this.A08.A00;
                if (!C18270x1.A0A(C18330xA.A04(context.getFilesDir().getParent(), "shared_prefs"), ".xml", AnonymousClass000.A0l("ab-props-backup")).exists()) {
                    return;
                }
                if (iArr[0] >= r2.A03(C66663Mh.A12) || iArr[1] >= r2.A03(C66663Mh.A11)) {
                    File A0A3 = C18270x1.A0A(C18330xA.A04(context.getFilesDir().getParent(), "shared_prefs"), ".xml", AnonymousClass000.A0l("ab-props-backup"));
                    File A0A4 = AnonymousClass002.A0A(C18330xA.A04(context.getFilesDir().getParent(), "shared_prefs"), AnonymousClass000.A0T("ab-props", ".xml"));
                    if (A0A3.exists()) {
                        A0A3.renameTo(A0A4);
                    }
                    C55682qk r22 = this.A01;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Crashes count foreground:");
                    A0o2.append(iArr[0]);
                    A0o2.append(" Crashes count background: ");
                    r22.A0A("RevertToPreviousStableABPropsCopy", false, AnonymousClass000.A0h(A0o2, iArr[1]));
                    return;
                }
                return;
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    public void A03(String str) {
        SharedPreferences.Editor A032 = C18270x1.A03(this.A06);
        A032.putString("crash_state_manager:system_exit", str);
        if (!A032.commit()) {
            Log.w("reportSystemExit/failed-to-save-preferences");
        }
        System.exit(0);
    }

    public void BMd() {
        this.A09.Bkn(C69983Zk.A00(this, 3), "AppAsyncInit/clear-crash-count", 10000);
    }

    public AnonymousClass3DM(C29171iO r1, C55682qk r2, AnonymousClass5XU r3, C66663Mh r4, C620633i r5, C54292oU r6, AnonymousClass33p r7, AnonymousClass1VX r8, C60152y5 r9, AnonymousClass4FS r10) {
        this.A07 = r8;
        this.A05 = r6;
        this.A09 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = r1;
    }

    public String BDW() {
        return "CrashStateManager";
    }

    public /* synthetic */ void BMe() {
    }
}
