const Chapter = ({content, trials}) =>
<section className="chapter">
    { content }
    { trials &&
        <ol>
            { trials.map((trial) => (
                <li key={trial.number}> { trial.content }</li>
            ))}
        </ol>
    }
</section>

export default Chapter