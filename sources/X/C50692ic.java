package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2ic  reason: invalid class name and case insensitive filesystem */
public abstract class C50692ic {
    public List A00(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr;
        String str6;
        String str7;
        String str8;
        if (this instanceof C28601hT) {
            str6 = "com.miui.miuihome";
            str7 = "com.miui.miuihome2";
            str8 = "com.miui.miuilite";
        } else if (this instanceof C28571hQ) {
            str6 = "com.sonymobile.home";
            str7 = "com.sonymobile.launcher";
            str8 = "com.sonyericsson.home";
        } else {
            if (this instanceof C28561hP) {
                str2 = "com.sec.android.app.easylauncher";
                str3 = "com.sec.android.emergencylauncher";
                str4 = "com.sec.android.app.launcher";
                str5 = "com.sec.android.app.twlauncher";
            } else {
                if (this instanceof C28591hS) {
                    C28591hS r5 = (C28591hS) this;
                    String str9 = Build.MANUFACTURER;
                    if (str9.equalsIgnoreCase("OPPO") || str9.equalsIgnoreCase("realme")) {
                        String str10 = Build.BRAND;
                        if (str10.equalsIgnoreCase("oppo") || str10.equalsIgnoreCase("realme")) {
                            boolean z = false;
                            try {
                                z = !TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.build.version.oplusrom"}));
                            } catch (Exception e) {
                                Log.e("Error while checking oppo launcher information", e);
                            }
                            if (z && r5.A00.A0Y(C58422vE.A02, 503)) {
                                str = "com.android.launcher";
                            }
                        }
                    }
                    str = "com.oppo.launcher";
                } else if (this instanceof AnonymousClass1hO) {
                    return Collections.singletonList("com.huawei.android.launcher");
                } else {
                    if (this instanceof C28611hU) {
                        if (((C28611hU) this).A03(context) < 4.0f) {
                            return AnonymousClass001.A0s();
                        }
                        str = "com.htc.launcher";
                    } else if (!(this instanceof C28581hR)) {
                        str2 = "com.lge.launcher2";
                        str3 = "com.lge.launcher3";
                        str4 = "com.asus.launcher";
                        str5 = "com.lge.launcher";
                    } else if (!((C28581hR) this).A00.A0Y(C58422vE.A02, 2337)) {
                        return Collections.emptyList();
                    } else {
                        str = "com.hihonor.android.launcher";
                    }
                }
                return Collections.singletonList(str);
            }
            strArr = new String[]{str4, str5, str2, str3};
            return Arrays.asList(strArr);
        }
        strArr = new String[]{str8, str6, str7};
        return Arrays.asList(strArr);
    }

    public void A01(int i, Notification notification) {
        if ((this instanceof C28601hT) && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                Method declaredMethod = obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE});
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, i, 0);
                declaredMethod.invoke(obj, objArr);
            } catch (Exception unused) {
                Log.e("Could not set badge for Xiaomi notification");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6 A[SYNTHETIC, Splitter:B:29:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0 A[Catch:{ Exception -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Context r23, X.C620633i r24, int r25) {
        /*
            r22 = this;
            r2 = r22
            boolean r0 = r2 instanceof X.C28601hT
            r9 = r23
            r8 = r25
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "android.app.MiuiNotification"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ Exception -> 0x002a }
            java.lang.Class r1 = r2.getClass()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = "messageCount"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x002a }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x002a }
            r1.set(r2, r0)     // Catch:{ Exception -> 0x002a }
            return
        L_0x002a:
            java.lang.String r0 = "android.intent.action.APPLICATION_MESSAGE_UPDATE"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.StringBuilder r1 = X.C18320x8.A0k(r9)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = "com.whatsapp.Main"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "android.intent.extra.update_application_component_name"
            r2.putExtra(r0, r1)
            if (r25 != 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0048:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "android.intent.extra.update_application_message_text"
            r2.putExtra(r0, r1)
            goto L_0x0109
        L_0x0053:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0048
        L_0x0058:
            boolean r0 = r2 instanceof X.C28621hV
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r2.addCategory(r0)
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch:{ RuntimeException -> 0x007a }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ RuntimeException -> 0x007a }
            if (r0 == 0) goto L_0x0080
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ RuntimeException -> 0x007a }
            if (r0 == 0) goto L_0x0080
            java.lang.String r4 = r0.packageName     // Catch:{ RuntimeException -> 0x007a }
            goto L_0x0082
        L_0x007a:
            r1 = move-exception
            java.lang.String r0 = "Exception while getting launcher name"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0080:
            java.lang.String r4 = ""
        L_0x0082:
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r1 = "package"
            java.lang.String r0 = r9.getPackageName()
            r3.putString(r1, r0)
            java.lang.String r1 = "class"
            java.lang.String r0 = "com.whatsapp.Main"
            r3.putString(r1, r0)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r8)
            java.lang.String r0 = "com.transsion.XOSLauncher"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = "change_badge"
            if (r0 == 0) goto L_0x00b0
            X.5UR r1 = X.C620633i.A02(r24)     // Catch:{ Exception -> 0x00c2 }
            android.net.Uri r0 = X.C28621hV.A01     // Catch:{ Exception -> 0x00c2 }
            r1.A04(r0, r3, r2)     // Catch:{ Exception -> 0x00c2 }
            return
        L_0x00b0:
            java.lang.String r0 = "com.transsion.hilauncher"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x00c2 }
            if (r0 == 0) goto L_0x010c
            X.5UR r1 = X.C620633i.A02(r24)     // Catch:{ Exception -> 0x00c2 }
            android.net.Uri r0 = X.C28621hV.A00     // Catch:{ Exception -> 0x00c2 }
            r1.A04(r0, r3, r2)     // Catch:{ Exception -> 0x00c2 }
            return
        L_0x00c2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "badger/getbadger "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x00d1:
            boolean r0 = r2 instanceof X.C28571hQ
            if (r0 == 0) goto L_0x010d
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            java.lang.String r0 = "com.sonymobile.home.resourceprovider"
            r4 = 0
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r0, r4)
            if (r0 != 0) goto L_0x02c1
            java.lang.String r0 = "com.sonyericsson.home.action.UPDATE_BADGE"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r1 = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"
            java.lang.String r0 = r9.getPackageName()
            r2.putExtra(r1, r0)
            java.lang.String r1 = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"
            java.lang.String r0 = "com.whatsapp.Main"
            r2.putExtra(r1, r0)
            if (r25 <= 0) goto L_0x00fb
            r4 = 1
        L_0x00fb:
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"
            r2.putExtra(r0, r4)
            java.lang.String r1 = "com.sonyericsson.home.intent.extra.badge.MESSAGE"
            java.lang.String r0 = java.lang.String.valueOf(r8)
        L_0x0106:
            r2.putExtra(r1, r0)
        L_0x0109:
            r9.sendBroadcast(r2)
        L_0x010c:
            return
        L_0x010d:
            boolean r0 = r2 instanceof X.C28591hS
            if (r0 == 0) goto L_0x0123
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r0 = "app_badge_count"
            r3.putInt(r0, r8)
            java.lang.String r1 = "app_badge_packageName"
            java.lang.String r0 = "com.whatsapp"
            r3.putString(r1, r0)
            goto L_0x02f7
        L_0x0123:
            boolean r0 = r2 instanceof X.AnonymousClass1hO
            if (r0 == 0) goto L_0x0150
            java.lang.String r4 = "com.huawei.android.launcher"
            long r5 = X.AnonymousClass345.A00(r9, r4)
            r1 = 63006(0xf61e, double:3.1129E-319)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "package"
            r3.putString(r0, r1)
            java.lang.String r1 = "class"
            java.lang.String r0 = "com.whatsapp.Main"
            r3.putString(r1, r0)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r8)
            goto L_0x0308
        L_0x0150:
            boolean r0 = r2 instanceof X.C28611hU
            if (r0 == 0) goto L_0x0279
            X.1hU r2 = (X.C28611hU) r2
            float r1 = r2.A03(r9)
            r0 = 1084227584(0x40a00000, float:5.0)
            r7 = 16
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0188
            java.lang.String r0 = "com.htc.launcher.action.SET_NOTIFICATION"
            android.content.Intent r3 = X.AnonymousClass0x9.A09(r0)
            r3.setFlags(r7)
            java.lang.String r2 = r9.getPackageName()
            java.lang.String r1 = "com.whatsapp.Main"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            java.lang.String r1 = "com.htc.launcher.extra.COMPONENT"
            java.lang.String r0 = r0.flattenToShortString()
            r3.putExtra(r1, r0)
            java.lang.String r0 = "com.htc.launcher.extra.COUNT"
            r3.putExtra(r0, r8)
            r9.sendBroadcast(r3)
            return
        L_0x0188:
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x010c
            java.lang.String r15 = "com.htc.launcher.action.UPDATE_SHORTCUT"
            android.content.Intent r6 = X.AnonymousClass0x9.A09(r15)
            r6.setFlags(r7)
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r5 = "packagename"
            r6.putExtra(r5, r0)
            java.lang.String r4 = "count"
            r6.putExtra(r4, r8)
            r9.sendBroadcast(r6)
            X.5UR r16 = X.C620633i.A02(r24)
            java.util.HashSet r11 = X.AnonymousClass002.A0K()
            java.lang.String r0 = "content://com.htc.launcher.settings/favorites"
            android.net.Uri r17 = android.net.Uri.parse(r0)
            java.lang.String r1 = "_id"
            java.lang.String r0 = "intent"
            java.lang.String[] r18 = new java.lang.String[]{r1, r0}
            java.lang.String r19 = "intent LIKE ?"
            java.lang.String[] r20 = X.AnonymousClass0x9.A1Y()
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "%"
            r10.append(r3)
            java.lang.String r2 = r9.getPackageName()
            java.lang.String r10 = X.AnonymousClass000.A0V(r2, r3, r10)
            r2 = 0
            r20[r2] = r10
            r21 = 0
            android.database.Cursor r10 = r16.A03(r17, r18, r19, r20, r21)
            if (r10 == 0) goto L_0x0228
            int r12 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x032d }
            int r13 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x032d }
            r10.moveToFirst()     // Catch:{ all -> 0x032d }
        L_0x01ec:
            boolean r0 = r10.isAfterLast()     // Catch:{ all -> 0x032d }
            if (r0 != 0) goto L_0x0225
            java.lang.String r0 = r10.getString(r13)     // Catch:{ all -> 0x032d }
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r2)     // Catch:{ URISyntaxException -> 0x0221 }
            android.content.ComponentName r14 = r0.getComponent()     // Catch:{ all -> 0x032d }
            if (r14 == 0) goto L_0x0221
            java.lang.String r1 = r9.getPackageName()     // Catch:{ all -> 0x032d }
            java.lang.String r0 = r14.getPackageName()     // Catch:{ all -> 0x032d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0221
            java.lang.String r1 = "com.whatsapp.Main"
            java.lang.String r0 = r14.getClassName()     // Catch:{ all -> 0x032d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x032d }
            if (r0 == 0) goto L_0x0221
            int r0 = r10.getInt(r12)     // Catch:{ all -> 0x032d }
            X.C18270x1.A1K(r11, r0)     // Catch:{ all -> 0x032d }
        L_0x0221:
            r10.moveToNext()     // Catch:{ all -> 0x032d }
            goto L_0x01ec
        L_0x0225:
            r10.close()
        L_0x0228:
            java.util.Iterator r12 = r11.iterator()
        L_0x022c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r1 = r12.next()
            java.lang.Number r1 = (java.lang.Number) r1
            android.content.Intent r11 = X.AnonymousClass0x9.A09(r15)
            r6.setFlags(r7)
            java.lang.String r0 = r9.getPackageName()
            r11.putExtra(r5, r0)
            java.lang.String r10 = "favorite_item_id"
            long r0 = r1.longValue()
            r11.putExtra(r10, r0)
            java.lang.String r10 = r9.getPackageName()
            java.lang.String r1 = "com.whatsapp.Main"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r10, r1)
            java.lang.String[] r10 = X.AnonymousClass0x9.A1Y()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = r0.flattenToShortString()
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            r10[r2] = r0
            java.lang.String r0 = "selectArgs"
            r11.putExtra(r0, r10)
            r11.putExtra(r4, r8)
            r9.sendBroadcast(r11)
            goto L_0x022c
        L_0x0279:
            boolean r0 = r2 instanceof X.C28581hR
            if (r0 == 0) goto L_0x02a7
            X.1hR r2 = (X.C28581hR) r2
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r1 = "package"
            java.lang.String r0 = r9.getPackageName()
            r3.putString(r1, r0)
            java.lang.String r1 = "class"
            java.lang.String r0 = "com.whatsapp.Main"
            r3.putString(r1, r0)
            java.lang.String r0 = "badgenumber"
            r3.putInt(r0, r8)
            X.1VX r2 = r2.A00
            r1 = 2337(0x921, float:3.275E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x010c
            goto L_0x0337
        L_0x02a7:
            java.lang.String r0 = "android.intent.action.BADGE_COUNT_UPDATE"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "badge_count"
            r2.putExtra(r0, r8)
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "badge_count_package_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "badge_count_class_name"
            java.lang.String r0 = "com.whatsapp.Main"
            goto L_0x0106
        L_0x02c1:
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "badge_count"
            X.C18270x1.A0b(r3, r0, r8)
            java.lang.String r1 = "package_name"
            java.lang.String r0 = r9.getPackageName()
            r3.put(r1, r0)
            java.lang.String r1 = "activity_name"
            java.lang.String r0 = "com.whatsapp.Main"
            r3.put(r1, r0)
            X.5UR r2 = r24.A0R()
            X.C626936e.A06(r2)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = "content://com.sonymobile.home.resourceprovider/badge"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x02f3 }
            X.C162457s7.A0J(r1, r4)     // Catch:{ Exception -> 0x02f3 }
            android.content.ContentResolver r0 = r2.A02()     // Catch:{ Exception -> 0x02f3 }
            r0.insert(r1, r3)     // Catch:{ Exception -> 0x02f3 }
            return
        L_0x02f3:
            r1 = move-exception
            java.lang.String r0 = "badger/sony/updatebadge"
            goto L_0x034e
        L_0x02f7:
            X.5UR r2 = X.C620633i.A02(r24)     // Catch:{ Exception -> 0x034b }
            java.lang.String r0 = "content://com.android.badge/badge"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x034b }
            java.lang.String r0 = "setAppBadgeCount"
            r2.A04(r1, r3, r0)     // Catch:{ Exception -> 0x034b }
            return
        L_0x0308:
            X.5UR r2 = X.C620633i.A02(r24)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "content://com.huawei.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "change_badge"
            r2.A04(r1, r3, r0)     // Catch:{ Exception -> 0x0318 }
            return
        L_0x0318:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected exception, launcher version = "
            r2.append(r0)
            long r0 = X.AnonymousClass345.A00(r9, r4)
            r2.append(r0)
            X.C18280x3.A1C(r2, r3)
            return
        L_0x032d:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0332 }
            throw r1
        L_0x0332:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0337:
            X.5UR r2 = X.C620633i.A02(r24)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r0 = "content://com.hihonor.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r0 = "change_badge"
            r2.A04(r1, r3, r0)     // Catch:{ Exception -> 0x0347 }
            return
        L_0x0347:
            r1 = move-exception
            java.lang.String r0 = "Unexpected exception while honor badging"
            goto L_0x034e
        L_0x034b:
            r1 = move-exception
            java.lang.String r0 = "cannot update badge"
        L_0x034e:
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50692ic.A02(android.content.Context, X.33i, int):void");
    }
}
