package de.ovgu.featureide.sampling.process;

/**
 * Data class to store memory related data of evaluations.
 * 
 * @author Joshua Sprey
 */
public class SamplingMemoryResults {

	protected long statisticCreatedBytesTotal = 0;
	protected double statisticPauseTimeAvg = 0;
	protected double statisticPauseTimeTotal = 0;
	protected double statisticThroughput = 0;

	/**
	 * @return The total bytes generated by the sampling process. The returned value
	 *         is given in mega bytes (MBs).
	 */
	public long getStatisticCreatedBytesTotal() {
		return statisticCreatedBytesTotal;
	}

	/**
	 * @return The average pause time for one garbage process in milliseconds (ms).
	 */
	public double getStatisticPauseTimeAvg() {
		return statisticPauseTimeAvg;
	}

	/**
	 * @return The total time in milliseconds (ms) that the garbage collector paused
	 *         the sampling process.
	 */
	public double getStatisticPauseTimeTotal() {
		return statisticPauseTimeTotal;
	}

	/**
	 * @return The throughput of the sampling process. It is the relation between
	 *         complete runtime and total pause time.
	 */
	public double getStatisticThroughput() {
		return statisticThroughput;
	}

	/**
	 * Sets the number of mega bytes (MB) created of this run.
	 * 
	 * @param statisticPauseTimeAvg The number of generated mega bytes (MB).
	 */
	public void setStatisticCreatedBytesTotal(long statisticCreatedBytesTotal) {
		this.statisticCreatedBytesTotal = statisticCreatedBytesTotal;
	}

	/**
	 * Sets the average pause time of this run.
	 * 
	 * @param statisticPauseTimeAvg The average pause time in milliseconds (ms).
	 */
	public void setStatisticPauseTimeAvg(double statisticPauseTimeAvg) {
		this.statisticPauseTimeAvg = statisticPauseTimeAvg;
	}

	/**
	 * Sets the total pause time of this run.
	 * 
	 * @param statisticPauseTimeTotal The total pause time in milliseconds (ms).
	 */
	public void setStatisticPauseTimeTotal(double statisticPauseTimeTotal) {
		this.statisticPauseTimeTotal = statisticPauseTimeTotal;
	}

	/**
	 * Sets the throughput of this run.
	 * 
	 * @param statisticThroughput The throughput as value between (0-1) meaning:<br>
	 *                            0 = 0% <br>
	 *                            1 = 100% <br>
	 */
	public void setStatisticThroughput(double statisticThroughput) {
		this.statisticThroughput = statisticThroughput;
	}
}