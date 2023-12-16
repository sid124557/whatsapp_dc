package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.330  reason: invalid class name */
public class AnonymousClass330 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C106655Zv[] A0B;

    public static AnonymousClass330 A01(byte[] bArr) {
        String str;
        if (bArr != null) {
            try {
                return A00(AnonymousClass0x7.A12(C58152un.A0B, bArr));
            } catch (JSONException unused) {
                str = "StickerMetadata/createFromWebpMetadata invalid metadata";
                Log.e(str);
                return null;
            } catch (UnsupportedEncodingException unused2) {
                str = "StickerMetadata/createFromWebpMetadata invalid metadata encoding";
                Log.e(str);
                return null;
            }
        }
        return null;
    }

    public String toString() {
        String obj;
        StringBuffer stringBuffer = new StringBuffer("StickerMetadata{");
        stringBuffer.append("emojis=");
        C106655Zv[] r0 = this.A0B;
        if (r0 == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(r0).toString();
        }
        stringBuffer.append(obj);
        stringBuffer.append(", isFirstPartySticker=");
        stringBuffer.append(this.A09);
        stringBuffer.append(", isFromStickerMaker=");
        stringBuffer.append(this.A0A);
        stringBuffer.append(", isAvatarSticker=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", avatarStickerTemplateId=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isAiSticker=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", isAvatarCountrySticker=");
        stringBuffer.append(this.A07);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public AnonymousClass330(String str, String str2, String str3, String str4, String str5, String str6, C106655Zv[] r7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0B = r7;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A01 = str5;
        this.A04 = str4;
        this.A08 = z3;
        this.A00 = str6;
        this.A0A = z2;
        this.A09 = z;
        this.A06 = z4;
        this.A07 = z5;
    }

    public static AnonymousClass330 A00(JSONObject jSONObject) {
        String str;
        C106655Zv[] r14;
        Object opt;
        ArrayList A0s = AnonymousClass001.A0s();
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.has("emojis") && (opt = jSONObject2.opt("emojis")) != null) {
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                for (int i = 0; i < jSONArray.length(); i++) {
                    String optString = jSONArray.optString(i, (String) null);
                    if (optString != null) {
                        A0s.add(C106655Zv.A00(optString));
                    }
                }
            } else if (opt instanceof String) {
                String str2 = (String) opt;
                int length = str2.length();
                if (length > 2) {
                    for (String str3 : C18320x8.A1b(str2.substring(1, length - 1))) {
                        if (str3 != null) {
                            A0s.add(C106655Zv.A00(str3));
                        }
                    }
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A17(C18310x6.A0c(opt, "StickerMetadata/createFromWebpMetadata unrecognizable type of emoji metadata:", A0o), A0o);
            }
        }
        if (jSONObject2.has("sticker-pack-id")) {
            str = jSONObject2.optString("sticker-pack-id", (String) null);
        } else {
            Log.d("StickerMetadata/createFromWebpMetadata no sticker pack id added");
            str = null;
        }
        if (!A0s.isEmpty()) {
            r14 = (C106655Zv[]) A0s.toArray(new C106655Zv[0]);
        } else {
            r14 = null;
        }
        return new AnonymousClass330(str, jSONObject2.optString("sticker-pack-name", (String) null), jSONObject2.optString("sticker-pack-publisher", (String) null), jSONObject2.optString("android-app-store-link", (String) null), jSONObject2.optString("ios-app-store-link", (String) null), jSONObject2.optString("avatar-sticker-template-id", (String) null), r14, AnonymousClass000.A1U(jSONObject2.optInt("is-first-party-sticker", 0), 1), AnonymousClass000.A1U(jSONObject2.optInt("is-from-sticker-maker", 0), 1), AnonymousClass000.A1U(jSONObject2.optInt("is-avatar-sticker", 0), 1), AnonymousClass000.A1U(jSONObject2.optInt("is-ai-sticker", 0), 1), AnonymousClass000.A1U(jSONObject2.optInt("is-avatar-country-sticker", 0), 1));
    }

    public byte[] A02() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("sticker-pack-id", this.A02);
            A1G.put("sticker-pack-name", this.A03);
            A1G.put("sticker-pack-publisher", this.A05);
            String str = this.A04;
            if (str != null) {
                A1G.put("android-app-store-link", str);
            }
            String str2 = this.A01;
            if (str2 != null) {
                A1G.put("ios-app-store-link", str2);
            }
            C106655Zv[] r5 = this.A0B;
            if (r5 != null) {
                ArrayList A0I = AnonymousClass002.A0I(r4);
                for (C106655Zv A1D : r5) {
                    AnonymousClass0x7.A1D(A1D, A0I);
                }
                A1G.put("emojis", new JSONArray(A0I));
            }
            if (this.A09) {
                A1G.put("is-first-party-sticker", 1);
            }
            if (this.A0A) {
                A1G.put("is-from-sticker-maker", 1);
            }
            if (this.A08) {
                A1G.put("is-avatar-sticker", 1);
            }
            String str3 = this.A00;
            if (str3 != null) {
                A1G.put("avatar-sticker-template-id", str3);
            }
            if (this.A06) {
                A1G.put("is-ai-sticker", 1);
            }
            if (this.A07) {
                A1G.put("is-avatar-country-sticker", 1);
            }
            return AnonymousClass0x9.A1R(A1G);
        } catch (JSONException e) {
            Log.e("StickerMetadata/convertToBytes error during JSON conversion", e);
            return null;
        }
    }
}
