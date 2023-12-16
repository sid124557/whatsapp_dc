package X;

import android.content.Context;
import android.content.pm.FeatureInfo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1hU  reason: invalid class name and case insensitive filesystem */
public final class C28611hU extends C50692ic {
    public static Pattern A01;
    public float A00 = -1.0f;

    public final float A03(Context context) {
        float f = this.A00;
        if (f >= 0.0f) {
            return f;
        }
        this.A00 = 0.0f;
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        int length = systemAvailableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            try {
                String str = systemAvailableFeatures[i].name;
                if (str != null && str.startsWith("com.htc.software.Sense")) {
                    Pattern pattern = A01;
                    if (pattern == null) {
                        pattern = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
                        A01 = pattern;
                    }
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches()) {
                        float parseFloat = Float.parseFloat(matcher.group(1));
                        if (Float.valueOf(parseFloat) != null) {
                            this.A00 = parseFloat;
                            break;
                        }
                    } else {
                        throw new NumberFormatException("could not find version");
                    }
                }
            } catch (NumberFormatException unused) {
            }
            i++;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("badger/htc/sense ");
        A0o.append(this.A00);
        C18280x3.A14(A0o);
        return this.A00;
    }
}
