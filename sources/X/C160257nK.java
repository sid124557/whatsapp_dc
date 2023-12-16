package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7nK  reason: invalid class name and case insensitive filesystem */
public class C160257nK {
    public static final String[] A04 = {"biz.stachibana.TaskKiller", "cn.com.android.opda.taskman", "com.arron.taskManager", "com.arron.taskManagerFree", "com.bright.taskcleaner.activity", "com.cool.taskkiller", "com.elnware.ActiveAppsAds", "com.estrongs.android.taskmanager", "com.gau.go.launcherex.gowidget.taskmanagerex", "com.ijinshan.kbatterydoctor", "com.ijinshan.kbatterydoctor_en", "com.iobit.mobilecare", "com.james.SmartTaskManager", "com.james.SmartTaskManagerLite", "com.james.SmartTaskManagerPro", "com.latedroid.juicedefender", "com.latedroid.juicedefender.beta", "com.latedroid.juicedefender.plus", "com.latedroid.ultimatejuice", "com.latedroid.ultimatejuice.root", "com.lookout.zapper", "com.mobo.task.killer", "com.netqin.aotkiller", "com.netqin.mobileguard", "com.rechild.advancedtaskkiller", "com.rechild.advancedtaskkillerfroyo", "com.rechild.advancedtaskkillerpro", "com.rechild.cleaner", "com.rhythm.hexise.task", "com.sand.taskmanager", "com.sta_beers.auto_task", "com.symantec.monitor", "com.task.killer", "com.tni.TasKiller", "com.zdworks.android.toolbox", "com.zomut.watchdog", "com.zomut.watchdoglite", "gpc.myweb.hinet.net.TaskManager", "imoblife.memorybooster.lite", "jp.co.aplio.simpletaskkiller", "jp.co.aplio.simpletaskkillerfree", "jp.smapho.quicktaskkiller", "mobi.infolife.taskmanager", "mobi.infolife.taskmanagerpro", "net.lepeng.batterydoctor", "net.lepeng.superboxss"};
    public static final String[] A05 = {"com.agilesoftresource", "com.antivirus", "com.cleanmaster.mguard", "com.electricsheep.asi", "com.estrongs.android.pop", "com.estrongs.android.pop.cupcake", "com.metago.astro", "com.smartwho.SmartFileManager", "com.smartwho.SmartFileManagerPro", "nextapp.systempanel", "nextapp.systempanel.r1"};
    public final C172758Mp A00;
    public final AnonymousClass4FS A01;
    public final CountDownLatch A02 = C18290x4.A14();
    public final AtomicReference A03 = new AtomicReference(new AnonymousClass5I5((Set) null, (Set) null));

    public C160257nK(C54292oU r3, AnonymousClass4FS r4) {
        this.A01 = r4;
        this.A00 = new C172758Mp(r3, this);
    }

    public static Set A00(Context context, String str, String[] strArr) {
        CharSequence charSequence;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            HashSet A0K = AnonymousClass002.A0K();
            for (String str2 : strArr) {
                try {
                    try {
                        charSequence = packageManager.getApplicationInfo(str2, 0).loadLabel(packageManager);
                    } catch (Exception e) {
                        Log.e("exception during task-killer name lookup: ", e);
                        charSequence = str2;
                    }
                    StringBuilder A0l = AnonymousClass000.A0l(str);
                    A0l.append(' ');
                    C18260x0.A1M(A0l, str2);
                    A0K.add(new C104065Pm(charSequence, str2));
                } catch (PackageManager.NameNotFoundException unused) {
                } catch (RuntimeException e2) {
                    StringBuilder A0l2 = AnonymousClass000.A0l(str);
                    A0l2.append(' ');
                    C18260x0.A1K(A0l2, e2.getMessage());
                }
            }
            if (!A0K.isEmpty()) {
                return A0K;
            }
        }
        return null;
    }

    public AnonymousClass5I5 A01(TimeUnit timeUnit, int i) {
        Object obj;
        C18260x0.A0w("taskkillers/scan timeout=", AnonymousClass001.A0o(), i);
        C160257nK r1 = this.A00.A01;
        if (r1.A02.await((long) i, timeUnit)) {
            AnonymousClass5I5 r3 = (AnonymousClass5I5) r1.A03.get();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("taskkillers/scan results=");
            Set set = r3.A00;
            Object obj2 = "null";
            if (set != null) {
                obj = Integer.valueOf(set.size());
            } else {
                obj = obj2;
            }
            A0o.append(obj);
            AnonymousClass001.A1L(A0o);
            Set set2 = r3.A01;
            if (set2 != null) {
                obj2 = Integer.valueOf(set2.size());
            }
            C18260x0.A0m(obj2, A0o);
            return r3;
        }
        throw new TimeoutException();
    }
}
