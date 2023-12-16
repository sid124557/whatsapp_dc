package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;
import com.whatsapp.R;
import com.whatsapp.TellAFriendReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2fa  reason: invalid class name and case insensitive filesystem */
public class C48852fa {
    public final C116985rC A00;
    public final C69263Wi A01;
    public final C49762h3 A02;

    public void A00(Context context, Uri uri, Integer num, String str) {
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.SENDTO");
        A09.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A09, 0);
        if (!queryIntentActivities.isEmpty()) {
            C18260x0.A1C("app/sms ", AnonymousClass001.A0o(), queryIntentActivities);
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
            if (!TextUtils.isEmpty(defaultSmsPackage)) {
                A09.setPackage(defaultSmsPackage);
            } else {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A09.setClassName(activityInfo.packageName, activityInfo.name);
                defaultSmsPackage = activityInfo.packageName;
            }
            if (!TextUtils.isEmpty(str)) {
                A09.putExtra("sms_body", str);
            }
            context.startActivity(A09);
            if (num != null) {
                this.A02.A01(num, defaultSmsPackage, 3);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    public void A01(Context context, Integer num) {
        Integer num2 = num;
        if (num != null) {
            Context context2 = context;
            String string = context2.getString(R.string.f11nameremoved);
            String A0F = AnonymousClass002.A0F(context2, "https://whatsapp.com/dl/", new Object[1], 0, R.string.f11nameremoved);
            String A0V = AnonymousClass000.A0V(AnonymousClass0x2.A0X(context2, "https://whatsapp.com/dl/", 1, R.string.f11nameremoved), "\n\n", AnonymousClass001.A0o());
            String string2 = context2.getString(R.string.f11nameremoved);
            PackageManager packageManager = context2.getPackageManager();
            ArrayList A0s = AnonymousClass001.A0s();
            HashSet A0K = AnonymousClass002.A0K();
            Intent putExtra = AnonymousClass0x9.A09("android.intent.action.VIEW").setType("vnd.android-dir/mms-sms").putExtra("sms_body", A0F);
            Intent putExtra2 = AnonymousClass0x9.A09("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", " ").putExtra("android.intent.extra.TEXT", A0V).putExtra("android.intent.extra.SUBJECT", string2);
            Intent[] intentArr = new Intent[2];
            C18280x3.A19(putExtra, putExtra2, intentArr);
            Intent intent = null;
            int i = 0;
            do {
                Intent intent2 = intentArr[i];
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str = activityInfo.name;
                        String str2 = activityInfo.applicationInfo.packageName;
                        Intent intent3 = intent;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("app/tell ");
                        A0o.append(i);
                        A0o.append(" | ");
                        A0o.append(str2);
                        C18260x0.A0s(" | ", str, A0o);
                        if (!str2.contains("bluetooth") && !str2.equals("com.sec.android.app.FileTransferClient") && !str2.equals("com.sec.android.app.FileShareClient") && !str2.equals("com.sec.android.widgetapp.diotek.smemo") && !str2.equals("com.threebanana.notes") && !str2.equals("com.evernote") && !str2.equals("com.android.apps.tag") && !str2.equals("com.andrewshu.android.reddit") && !str2.equals("com.dataviz.stargate") && !str2.equals("com.dropbox.android") && !str2.equals("com.google.zxing.client.android") && !str2.equals("com.lg.valle.phone2chrome") && !str2.equals("com.motorola.blur.socialshare") && !str2.equals("com.whatsapp") && !str2.equals("com.whatsapp.w4b") && !str2.equals("la.droid.qr") && !str2.equals("com.google.android.apps.translate") && !str2.equals("com.google.android.apps.docs") && !str2.equals(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE) && !str2.equals("com.world.newspapers") && !str2.equals("lysesoft.andftp") && !str2.equals("com.klye.ime.latin") && !str2.equals("com.ideashower.readitlater.pro") && !str2.equals("com.springpad") && !str2.equals("ch.teamtasks.tasks.paid") && !str2.equals("flipboard.app") && !str2.equals("jp.naver.cafe") && !str2.equals("org.mozilla.firefox") && !str2.equals("com.linkedin.android") && !str2.equals("com.tenthbit.juliet") && !str2.equals("com.bumptech.bumpga")) {
                            intent = (Intent) intent2.clone();
                            intent.setClassName(str2, str);
                            intent.setPackage(str2);
                            if (str2.equals("mobi.qiss.plurq") || str2.equals("com.htc.socialnetwork.plurk") || str2.equals("com.facebook.orca") || str2.equals("com.google.android.apps.plus") || str2.equals("com.google.android.apps.googlevoice") || str2.equals("com.google.android.apps.messaging") || str2.equals("com.thedeck.android.app") || str2.equals("com.twitter.android") || str2.equals("tw.anddev.aplurk")) {
                                intent.removeExtra("android.intent.extra.EMAIL");
                                intent.putExtra("android.intent.extra.TEXT", A0F);
                            } else if (str2.equals("com.facebook.katana")) {
                                intent.putExtra("android.intent.extra.TEXT", "https://www.whatsapp.com/download/");
                            }
                            if (!A0K.contains(str2)) {
                                C18260x0.A1P(AnonymousClass001.A0o(), "app/tell/add ", intent);
                                A0s.add(intent);
                                A0K.add(str2);
                                if (str.equals("com.lge.message.activity.compose.ComposeMessageActivity")) {
                                }
                            }
                        }
                        intent = intent3;
                    }
                }
                i++;
            } while (i < 2);
            int size = A0s.size();
            if (size != 0) {
                String A0V2 = AnonymousClass000.A0V("-", Build.MODEL.replace(' ', '_'), AnonymousClass000.A0l(Build.MANUFACTURER.replace(' ', '_')));
                C18260x0.A0s("app/packagedintents/device ", A0V2, AnonymousClass001.A0o());
                if (!A0V2.equals("LGE-LU2300")) {
                    if (size > 1) {
                        int i2 = size - 1;
                        Object obj = A0s.get(i2);
                        A0s.remove(i2);
                        A0s.add(0, obj);
                    }
                    context2.startActivity(C107395bF.A01(C624735e.A03(context2, AnonymousClass0x9.A08(context2, TellAFriendReceiver.class).putExtra("extra_invite_source", num2), 0).getIntentSender(), string, A0s));
                } else if (intent != null) {
                    Log.i("app/tell/override");
                    context2.startActivity(intent);
                }
                this.A02.A00(num2);
            }
            Log.w("app/tell/none");
            this.A01.A0F(R.string.f11nameremoved, 0);
            this.A02.A00(num2);
        }
    }

    public C48852fa(C116985rC r1, C69263Wi r2, C49762h3 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
