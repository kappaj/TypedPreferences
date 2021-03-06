package info.metadude.android.typedpreferences;

import android.content.SharedPreferences;

/**
 * A wrapper class for a long preference.
 */
public class LongPreference extends BasePreference {

    protected final long mDefaultValue;
    public static final long DEFAULT_VALUE_VALUE = 0L;

    /**
     * Constructs a {@code long} preference for the given key
     * having the default value set to {@code 0} available.
     */
    public LongPreference(final SharedPreferences preferences, final String key) {
        this(preferences, key, DEFAULT_VALUE_VALUE);
    }

    /**
     * Constructs a {@code long} preference for the given key
     * having the default value available.
     */
    public LongPreference(final SharedPreferences preferences, final String key, long defaultValue) {
        super(preferences, key);
        mDefaultValue = defaultValue;
    }

    /**
     * Returns the stored {@code long} value if it exists
     * or the default value.
     */
    public long get() {
        return mPreferences.getLong(mKey, mDefaultValue);
    }

    /**
     * Stores the given {@code long} value asynchronously.
     */
    public void set(long value) {
        mPreferences.edit().putLong(mKey, value).apply();
    }

}
