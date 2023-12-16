package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.8D3  reason: invalid class name */
public class AnonymousClass8D3 implements C185628tz {
    public AnonymousClass8D6 A00;
    public C142156wj A01;
    public String A02;
    public final JsonReader A03;

    public C142156wj BLY() {
        C142156wj r0;
        this.A02 = null;
        this.A00 = null;
        JsonReader jsonReader = this.A03;
        JsonToken peek = jsonReader.peek();
        int[] iArr = AnonymousClass77L.A00;
        switch (AnonymousClass6CA.A04(peek, iArr)) {
            case 1:
                r0 = C142156wj.NAME;
                break;
            case 2:
                r0 = C142156wj.NUMBER;
                break;
            case 3:
                r0 = C142156wj.NULL;
                break;
            case 4:
                r0 = C142156wj.START_ARRAY;
                break;
            case 5:
                r0 = C142156wj.END_ARRAY;
                break;
            case 6:
                r0 = C142156wj.START_OBJECT;
                break;
            case 7:
                r0 = C142156wj.END_OBJECT;
                break;
            case 8:
                r0 = C142156wj.END_DOCUMENT;
                break;
            case 9:
                r0 = C142156wj.BOOLEAN;
                break;
            case 10:
                r0 = C142156wj.STRING;
                break;
            default:
                throw AnonymousClass000.A0H(peek, "unknown JsonToken ", AnonymousClass001.A0o());
        }
        this.A01 = r0;
        switch (AnonymousClass6CA.A04(jsonReader.peek(), iArr)) {
            case 1:
                this.A02 = jsonReader.nextName();
                break;
            case 2:
            case 3:
            case 9:
            case 10:
                this.A00 = new AnonymousClass8D6(jsonReader);
                break;
            case 4:
                jsonReader.beginArray();
                break;
            case 5:
                jsonReader.endArray();
                break;
            case 6:
                jsonReader.beginObject();
                break;
            case 7:
                jsonReader.endObject();
                break;
            case 8:
                break;
            default:
                throw AnonymousClass001.A0e("unknown JsonToken ");
        }
        return this.A01;
    }

    public String Bgf() {
        return this.A02;
    }

    public C142156wj Bgg() {
        return this.A01;
    }

    public C185848uL Bgh() {
        return this.A00;
    }

    public void BpQ() {
        C142156wj r1 = this.A01;
        C142156wj r3 = C142156wj.START_ARRAY;
        if (r1 == r3 || r1 == C142156wj.START_OBJECT) {
            int i = 1;
            while (true) {
                C142156wj BLY = BLY();
                if (BLY == r3 || BLY == C142156wj.START_OBJECT) {
                    i++;
                } else if (BLY == C142156wj.END_ARRAY || BLY == C142156wj.END_OBJECT) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public AnonymousClass8D3(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }
}
