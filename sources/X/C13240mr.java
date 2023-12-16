package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0mr  reason: invalid class name and case insensitive filesystem */
public class C13240mr implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ File A01;

    public C13240mr(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, File file) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = file;
    }

    public static String A00(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue((String) null, str);
        }
        return attributeValue;
    }

    public void run() {
        FileInputStream fileInputStream;
        ComponentName componentName;
        try {
            File file = this.A01;
            if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
                file.mkdirs();
            }
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A00;
            File file2 = shortcutInfoCompatSaverImpl.A01;
            if ((!file2.exists() || file2.isDirectory() || file2.delete()) && !file2.exists()) {
                file2.mkdirs();
            }
            Map map = shortcutInfoCompatSaverImpl.A04;
            File file3 = shortcutInfoCompatSaverImpl.A02;
            Context context = shortcutInfoCompatSaverImpl.A00;
            AnonymousClass05C r10 = new AnonymousClass05C();
            try {
                fileInputStream = new FileInputStream(file3);
                if (file3.exists()) {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 2 && newPullParser.getName().equals("target") && newPullParser.getName().equals("target")) {
                                String A002 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, newPullParser);
                                String A003 = A00("short_label", newPullParser);
                                if (!TextUtils.isEmpty(A002) && !TextUtils.isEmpty(A003)) {
                                    int parseInt = Integer.parseInt(A00("rank", newPullParser));
                                    String A004 = A00("long_label", newPullParser);
                                    String A005 = A00("disabled_message", newPullParser);
                                    String A006 = A00("component", newPullParser);
                                    if (TextUtils.isEmpty(A006)) {
                                        componentName = null;
                                    } else {
                                        componentName = ComponentName.unflattenFromString(A006);
                                    }
                                    String A007 = A00("icon_resource_name", newPullParser);
                                    String A008 = A00("icon_bitmap_path", newPullParser);
                                    ArrayList A0s = AnonymousClass001.A0s();
                                    HashSet A0K = AnonymousClass002.A0K();
                                    while (true) {
                                        int next2 = newPullParser.next();
                                        if (next2 != 1) {
                                            if (next2 != 2) {
                                                if (next2 == 3 && newPullParser.getName().equals("target")) {
                                                    break;
                                                }
                                            } else {
                                                String name = newPullParser.getName();
                                                if (name.equals("intent")) {
                                                    String A009 = A00("action", newPullParser);
                                                    String A0010 = A00("targetPackage", newPullParser);
                                                    String A0011 = A00("targetClass", newPullParser);
                                                    if (A009 != null) {
                                                        Intent intent = new Intent(A009);
                                                        if (!TextUtils.isEmpty(A0010) && !TextUtils.isEmpty(A0011)) {
                                                            intent.setClassName(A0010, A0011);
                                                        }
                                                        A0s.add(intent);
                                                    }
                                                } else if (name.equals("categories")) {
                                                    String A0012 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, newPullParser);
                                                    if (!TextUtils.isEmpty(A0012)) {
                                                        A0K.add(A0012);
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    C05920Vm r1 = new C05920Vm(context, A002);
                                    AnonymousClass0U1 r13 = r1.A00;
                                    r13.A0B = A003;
                                    r13.A02 = parseInt;
                                    if (!TextUtils.isEmpty(A004)) {
                                        r13.A0C = A004;
                                    }
                                    if (!TextUtils.isEmpty(A005)) {
                                        r13.A0A = A005;
                                    }
                                    if (componentName != null) {
                                        r13.A04 = componentName;
                                    }
                                    if (!A0s.isEmpty()) {
                                        r13.A0P = (Intent[]) A0s.toArray(new Intent[0]);
                                    }
                                    if (!A0K.isEmpty()) {
                                        r13.A0F = A0K;
                                    }
                                    C03740Lj r12 = new C03740Lj(r1.A00(), A007, A008);
                                    r10.put(r12.A00.A0D, r12);
                                }
                            }
                        }
                    }
                    fileInputStream.close();
                    map.putAll(r10);
                    shortcutInfoCompatSaverImpl.A05(AnonymousClass002.A0J(map.values()));
                    return;
                }
                fileInputStream.close();
            } catch (Exception e) {
                file3.delete();
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A10(file3, "Failed to load saved values from file ", A0o);
                Log.e("ShortcutInfoCompatSaver", AnonymousClass000.A0X(". Old state removed, new added", A0o), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            map.putAll(r10);
            shortcutInfoCompatSaverImpl.A05(AnonymousClass002.A0J(map.values()));
            return;
            throw th;
        } catch (Exception e2) {
            Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e2);
        }
    }
}
