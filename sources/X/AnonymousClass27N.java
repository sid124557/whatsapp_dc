package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.27N  reason: invalid class name */
public class AnonymousClass27N {
    public static void A00(Context context, String str) {
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.Main");
        A07.setAction("android.intent.action.MAIN");
        A07.addCategory("android.intent.category.LAUNCHER");
        A07.addFlags(268435456);
        A07.addFlags(2097152);
        Intent A072 = C18320x8.A07();
        A072.putExtra("android.intent.extra.shortcut.INTENT", A07);
        A072.putExtra("duplicate", false);
        A072.putExtra("android.intent.extra.shortcut.NAME", str);
        A072.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, R.mipmap.icon));
        A072.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.sendBroadcast(A072);
    }
}
