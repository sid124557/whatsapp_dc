package X;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7f5  reason: invalid class name and case insensitive filesystem */
public final class C155547f5 {
    public static final Map A00;
    public static final Pattern A01 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final Pattern A02 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern A03 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        A0t.put("aliceblue", -984833);
        A0t.put("antiquewhite", -332841);
        A0t.put("aqua", -16711681);
        A0t.put("aquamarine", -8388652);
        A0t.put("azure", -983041);
        A0t.put("beige", -657956);
        A0t.put("bisque", -6972);
        A0t.put("black", -16777216);
        A0t.put("blanchedalmond", -5171);
        A0t.put("blue", -16776961);
        A0t.put("blueviolet", -7722014);
        A0t.put("brown", -5952982);
        A0t.put("burlywood", -2180985);
        A0t.put("cadetblue", -10510688);
        A0t.put("chartreuse", -8388864);
        A0t.put("chocolate", -2987746);
        A0t.put("coral", -32944);
        A0t.put("cornflowerblue", -10185235);
        A0t.put("cornsilk", -1828);
        A0t.put("crimson", -2354116);
        A0t.put("cyan", -16711681);
        A0t.put("darkblue", -16777077);
        A0t.put("darkcyan", -16741493);
        A0t.put("darkgoldenrod", -4684277);
        A0t.put("darkgray", -5658199);
        A0t.put("darkgreen", -16751616);
        A0t.put("darkgrey", -5658199);
        A0t.put("darkkhaki", -4343957);
        A0t.put("darkmagenta", -7667573);
        A0t.put("darkolivegreen", -11179217);
        A0t.put("darkorange", -29696);
        A0t.put("darkorchid", -6737204);
        A0t.put("darkred", -7667712);
        A0t.put("darksalmon", -1468806);
        A0t.put("darkseagreen", -7357297);
        A0t.put("darkslateblue", -12042869);
        A0t.put("darkslategray", -13676721);
        A0t.put("darkslategrey", -13676721);
        A0t.put("darkturquoise", -16724271);
        A0t.put("darkviolet", -7077677);
        A0t.put("deeppink", -60269);
        A0t.put("deepskyblue", -16728065);
        A0t.put("dimgray", -9868951);
        A0t.put("dimgrey", -9868951);
        A0t.put("dodgerblue", -14774017);
        A0t.put("firebrick", -5103070);
        A0t.put("floralwhite", -1296);
        A0t.put("forestgreen", -14513374);
        A0t.put("fuchsia", -65281);
        A0t.put("gainsboro", -2302756);
        A0t.put("ghostwhite", -460545);
        A0t.put("gold", -10496);
        A0t.put("goldenrod", -2448096);
        A0t.put("gray", -8355712);
        A0t.put("green", -16744448);
        A0t.put("greenyellow", -5374161);
        A0t.put("grey", -8355712);
        A0t.put("honeydew", -983056);
        A0t.put("hotpink", -38476);
        A0t.put("indianred", -3318692);
        A0t.put("indigo", -11861886);
        A0t.put("ivory", -16);
        A0t.put("khaki", -989556);
        A0t.put("lavender", -1644806);
        A0t.put("lavenderblush", -3851);
        A0t.put("lawngreen", -8586240);
        A0t.put("lemonchiffon", -1331);
        A0t.put("lightblue", -5383962);
        A0t.put("lightcoral", -1015680);
        A0t.put("lightcyan", -2031617);
        A0t.put("lightgoldenrodyellow", -329006);
        A0t.put("lightgray", -2894893);
        A0t.put("lightgreen", -7278960);
        A0t.put("lightgrey", -2894893);
        A0t.put("lightpink", -18751);
        A0t.put("lightsalmon", -24454);
        A0t.put("lightseagreen", -14634326);
        A0t.put("lightskyblue", -7876870);
        A0t.put("lightslategray", -8943463);
        A0t.put("lightslategrey", -8943463);
        A0t.put("lightsteelblue", -5192482);
        A0t.put("lightyellow", -32);
        A0t.put("lime", -16711936);
        A0t.put("limegreen", -13447886);
        A0t.put("linen", -331546);
        A0t.put("magenta", -65281);
        A0t.put("maroon", -8388608);
        A0t.put("mediumaquamarine", -10039894);
        A0t.put("mediumblue", -16777011);
        A0t.put("mediumorchid", -4565549);
        A0t.put("mediumpurple", -7114533);
        A0t.put("mediumseagreen", -12799119);
        A0t.put("mediumslateblue", -8689426);
        A0t.put("mediumspringgreen", -16713062);
        A0t.put("mediumturquoise", -12004916);
        A0t.put("mediumvioletred", -3730043);
        A0t.put("midnightblue", -15132304);
        A0t.put("mintcream", -655366);
        A0t.put("mistyrose", -6943);
        A0t.put("moccasin", -6987);
        A0t.put("navajowhite", -8531);
        A0t.put("navy", -16777088);
        A0t.put("oldlace", -133658);
        A0t.put("olive", -8355840);
        A0t.put("olivedrab", -9728477);
        A0t.put("orange", -23296);
        A0t.put("orangered", -47872);
        A0t.put("orchid", -2461482);
        A0t.put("palegoldenrod", -1120086);
        A0t.put("palegreen", -6751336);
        A0t.put("paleturquoise", -5247250);
        A0t.put("palevioletred", -2396013);
        A0t.put("papayawhip", -4139);
        A0t.put("peachpuff", -9543);
        A0t.put("peru", -3308225);
        A0t.put("pink", -16181);
        A0t.put("plum", -2252579);
        A0t.put("powderblue", -5185306);
        A0t.put("purple", -8388480);
        A0t.put("rebeccapurple", -10079335);
        A0t.put("red", -65536);
        A0t.put("rosybrown", -4419697);
        A0t.put("royalblue", -12490271);
        A0t.put("saddlebrown", -7650029);
        A0t.put("salmon", -360334);
        A0t.put("sandybrown", -744352);
        A0t.put("seagreen", -13726889);
        A0t.put("seashell", -2578);
        A0t.put("sienna", -6270419);
        A0t.put("silver", -4144960);
        A0t.put("skyblue", -7876885);
        A0t.put("slateblue", -9807155);
        A0t.put("slategray", -9404272);
        A0t.put("slategrey", -9404272);
        A0t.put("snow", -1286);
        A0t.put("springgreen", -16711809);
        A0t.put("steelblue", -12156236);
        A0t.put("tan", -2968436);
        A0t.put("teal", -16744320);
        A0t.put("thistle", -2572328);
        A0t.put("tomato", -40121);
        A0t.put("transparent", C18290x4.A0Z());
        A0t.put("turquoise", -12525360);
        A0t.put("violet", -1146130);
        A0t.put("wheat", -663885);
        A0t.put("white", AnonymousClass0x7.A0f());
        A0t.put("whitesmoke", -657931);
        A0t.put("yellow", -256);
        A0t.put("yellowgreen", -6632142);
    }

    public static int A00(String str, boolean z) {
        Pattern pattern;
        int parseInt;
        C161487pm.A03(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (AnonymousClass6C9.A00(replace) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            int length = replace.length();
            int i = -16777216;
            if (length != 7) {
                if (length == 9) {
                    i = (parseLong & 255) << 24;
                    parseLong >>>= 8;
                } else {
                    throw AnonymousClass6CA.A0N();
                }
            }
            return i | parseLong;
        }
        if (replace.startsWith("rgba")) {
            if (z) {
                pattern = A01;
            } else {
                pattern = A02;
            }
            Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                String A0f = AnonymousClass6C8.A0f(matcher, 4);
                if (z) {
                    parseInt = (int) (Float.parseFloat(A0f) * 255.0f);
                } else {
                    parseInt = Integer.parseInt(A0f, 10);
                }
                return Color.argb(parseInt, Integer.parseInt(AnonymousClass6C8.A0f(matcher, 1), 10), Integer.parseInt(AnonymousClass6C8.A0f(matcher, 2), 10), Integer.parseInt(AnonymousClass6C8.A0f(matcher, 3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = A03.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt(AnonymousClass6C8.A0f(matcher2, 1), 10), Integer.parseInt(AnonymousClass6C8.A0f(matcher2, 2), 10), Integer.parseInt(AnonymousClass6C8.A0f(matcher2, 3), 10));
            }
        } else {
            Number number = (Number) A00.get(AnonymousClass0x9.A0z(replace));
            if (number != null) {
                return number.intValue();
            }
        }
        throw AnonymousClass6CA.A0N();
    }
}
