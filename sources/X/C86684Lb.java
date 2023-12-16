package X;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.4Lb  reason: invalid class name and case insensitive filesystem */
public class C86684Lb extends AbstractCursor {
    public static final String[] A06 = C100815Cj.A00;
    public int A00 = -1;
    public Cursor A01;
    public boolean A02 = false;
    public final AnonymousClass1VX A03;
    public final C95814uZ A04;
    public final C55832qz A05;

    public short getShort(int i) {
        if (i != 5) {
            return 0;
        }
        C30471mV A002 = A00();
        C626936e.A06(A002);
        return (short) A002.A1I;
    }

    public C30471mV A00() {
        C624134x A042;
        C95814uZ r2 = this.A04;
        C55832qz r1 = this.A05;
        Cursor cursor = this.A01;
        if (r2 == null) {
            A042 = r1.A03(cursor);
        } else {
            A042 = r1.A04(cursor, r2);
        }
        return (C30471mV) A042;
    }

    public void close() {
        Log.d("MediaCursor/close");
        super.close();
        this.A01.close();
    }

    public String[] getColumnNames() {
        return A06;
    }

    public int getCount() {
        int i = this.A00;
        if (i < 0) {
            return this.A01.getCount();
        }
        return i;
    }

    public long getLong(int i) {
        if (i == 0) {
            return AnonymousClass0x2.A0C(this.A01, "_id");
        }
        if (i == 2) {
            C30471mV A002 = A00();
            C626936e.A06(A002);
            return A002.A0K;
        } else if (i != 6) {
            return 0;
        } else {
            C30471mV A003 = A00();
            C626936e.A06(A003);
            return (long) A003.A0B;
        }
    }

    public String getString(int i) {
        AnonymousClass33C r0;
        File file;
        if (i == 0) {
            return Long.toString(AnonymousClass0x2.A0C(this.A01, "_id"));
        }
        if (i == 1) {
            C30471mV A002 = A00();
            if (A002 == null || (r0 = A002.A01) == null || (file = r0.A0F) == null) {
                return "";
            }
            return file.getAbsolutePath();
        } else if (i == 2) {
            C30471mV A003 = A00();
            if (A003 != null) {
                return Long.toString(A003.A0K);
            }
            return "";
        } else if (i == 3) {
            C30471mV A004 = A00();
            C626936e.A06(A004);
            return A004.A1w();
        } else if (i != 4) {
            return "";
        } else {
            C30471mV A005 = A00();
            C626936e.A06(A005);
            byte b = A005.A1I;
            if (b == 1) {
                return "image/*";
            }
            if (b == 2) {
                return "audio/*";
            }
            if (b == 3) {
                return "video/*";
            }
            if (b != 9) {
                if (b == 13) {
                    return "image/gif";
                }
                if (b == 23 || b == 37 || b == 25) {
                    return "image/*";
                }
                if (b != 26) {
                    if (b == 28) {
                        return "video/*";
                    }
                    if (b != 29) {
                        return "";
                    }
                    return "image/gif";
                }
            }
            return A005.A05;
        }
    }

    public int getType(int i) {
        if (i == 0 || i == 2 || i == 5 || i == 6) {
            return 1;
        }
        return 3;
    }

    public boolean onMove(int i, int i2) {
        String str;
        if (i > i2 * 2) {
            this.A01.moveToPosition(-1);
            i = -1;
        }
        while (true) {
            if (i2 > i) {
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (!this.A01.moveToNext()) {
                        break;
                    } else if (A01()) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 > 0) {
                    C18260x0.A0y("MediaCursor/moveToNextImpl/next/skip ", AnonymousClass001.A0o(), i3);
                }
                i++;
                if (!z) {
                    this.A00 = i;
                    this.A01.moveToPosition(-1);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("MediaCursor/onMove/next/realcount ");
                    str = AnonymousClass000.A0h(A0o, this.A00);
                    break;
                }
            } else {
                while (i2 < i) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (true) {
                        if (!this.A01.moveToPrevious()) {
                            break;
                        } else if (A01()) {
                            z2 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 > 0) {
                        C18260x0.A0y("MediaCursor/moveToPreviousImpl/prev/skip ", AnonymousClass001.A0o(), i4);
                    }
                    if (!z2) {
                        this.A01.moveToPosition(-1);
                        str = "MediaCursor/onMove/prev/notfound";
                    } else {
                        i--;
                    }
                }
                return true;
            }
        }
        Log.i(str);
        onChange(true);
        return false;
    }

    public C86684Lb(Cursor cursor, AnonymousClass1VX r4, C95814uZ r5, C55832qz r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = cursor;
        this.A04 = r5;
        if (r4 != null) {
            this.A02 = !C107535bT.A0C(r4.A0Q(2917));
        }
        moveToPosition(0);
    }

    public final boolean A01() {
        AnonymousClass33C r1;
        AnonymousClass1VX r0;
        File file;
        C30471mV A002 = A00();
        if (A002 == null || (r1 = A002.A01) == null) {
            return false;
        }
        if ((A002.A1J.A02 || r1.A0R) && (file = r1.A0F) != null) {
            Uri fromFile = Uri.fromFile(file);
            if (fromFile == null || fromFile.getPath() == null) {
                return false;
            }
            return C18310x6.A0a(fromFile).exists();
        } else if (!this.A02 || !(A002 instanceof C31971pB) || (r0 = this.A03) == null || !AnonymousClass35Z.A02(r0, (AnonymousClass1nB) A002)) {
            return false;
        } else {
            return true;
        }
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public boolean isNull(int i) {
        return false;
    }
}
