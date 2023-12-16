package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2mV  reason: invalid class name and case insensitive filesystem */
public final class C53072mV {
    public JSONArray A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass4FV A02;
    public final C49252gE A03;

    public final void A01(int i) {
        C183538qC r4;
        synchronized (this) {
            AnonymousClass33p r3 = this.A01;
            synchronized (r3.A04) {
                r4 = r3.A01;
                C18270x1.A0h(C18270x1.A03(r3), "sticker_suggestion_triggered_count", C18280x3.A02(C18300x5.A0B(r4), "sticker_suggestion_triggered_count") + 1);
            }
            JSONArray jSONArray = this.A00;
            if (jSONArray == null) {
                String string = C18300x5.A0B(r4).getString("sticker_suggestion_num_suggestions_array", "[]");
                C162457s7.A0D(string);
                try {
                    jSONArray = new JSONArray(string);
                } catch (JSONException e) {
                    Log.e("StickerSuggestionLogger/getNumStickerSuggestionsJsonArray Error getting JSONArray", e);
                    jSONArray = AnonymousClass0x9.A1F();
                }
                this.A00 = jSONArray;
            }
            jSONArray.put(i);
            C18270x1.A0j(C18270x1.A03(r3), "sticker_suggestion_num_suggestions_array", String.valueOf(this.A00));
        }
    }

    public final void A00() {
        AnonymousClass33p r1 = this.A01;
        synchronized (r1.A04) {
            C18270x1.A0h(C18270x1.A03(r1), "sticker_suggestion_sticker_sent_count", C18280x3.A02(AnonymousClass0x2.A0F(r1), "sticker_suggestion_sticker_sent_count") + 1);
        }
    }

    public final void A02(int i, int i2, int i3) {
        C24671Yh r1 = new C24671Yh();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = AnonymousClass0x9.A0m(i2);
        r1.A02 = AnonymousClass0x9.A0m(i3);
        this.A02.BhD(r1);
    }

    public C53072mV(AnonymousClass33p r1, AnonymousClass4FV r2, C49252gE r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
